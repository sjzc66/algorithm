package com.sjzc.javaTest;

import com.alibaba.fastjson.JSON;
import com.sjzc.javaTest.vo.Address;
import com.sjzc.javaTest.vo.Person;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author mina
 * @Description: 深拷贝工具类
 * @Date: Created in 15:35 2019/3/7
 */
public class DeepCopyUtils {

    public static void main(String[] args) {
        Address address = new Address();
        address.setProvince("100");
        address.setCity("010");
        address.setAddress("惠新西街");

        Person person = new Person();
        person.setAge(18);
        person.setSex(true);
        person.setAddress(address);

        System.out.println(person);

        Person copy1 = null;
        Object copy2 = null;
        try {
            copy2 = DeepCopyUtils.copy1(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(copy1);
        System.out.println(copy2);
    }

    public static <T> T copy(T source) {
        // 获取所有src中的属性，存入于数组中
        String json = JSON.toJSONString(source);
        return (T)JSON.parseObject(json, Object.class);
    }

    public static Object copy1(Object source) throws Exception {
        Class<?> aClass = source.getClass();
        Class c = Class.forName(aClass.getName());
        Object o = c.newInstance();
        for (Field field : aClass.getDeclaredFields()) {
            if(Modifier.isStatic(field.getModifiers()))
                continue;
            field.setAccessible(true);
            Object value = field.get(source);
            // 基本类型
            if(field.getType().isPrimitive()) {
                field.set(o, value);
            }
            // 数组类型  因为数组类型也是 Object 的实例, 所以写在前面
            else if(field.getType().isArray() ) {
                field.set(o, operateArray(value));
            }
            // 不为null的对象
            else if(value instanceof Object) {
                field.set(o, copy1(value));
            }
            field.setAccessible(false);
        }
        return o;
    }

    // 一维数组, 二维
    public static Object operateArray(Object array) throws Exception {
        // 1. 数组不为null, 2. 数组长度 >= 0
        if (array == null)
            return null;

        int length = Array.getLength(array);
        Class componentType = array.getClass().getComponentType();

        // 基本类型 + String 类型, 因为String 类型的值是不变的, 所以采用等值
        if (componentType.isPrimitive() || componentType == String.class) {
            Object xxx = returnPrimitive(array, length);
            return xxx;
        }
        // 保证长度 > 0
        if (componentType.isArray()) {
            // 固定长度的多维数组
            Object value = Array.newInstance(array.getClass().getComponentType(), Array.getLength(array));
            int len = Array.getLength(array);
            for (int i = 0; i < len; i++) {
                Array.set(value, i, operateArray(Array.get(array, i)));
            }
            return value;
        } else {
            Object o = null;
            o = Array.newInstance(componentType, length);
            for (int i = 0; i < length; i++) {
                Object value = copy(Array.get(array, i));
                Array.set(o, i, value);
            }
            return o;
        }
    }

    public static Object returnPrimitive(Object array, int length) {
        Class componentType = array.getClass().getComponentType();
        if (componentType == int.class)
            return Arrays.copyOf((int[]) array, length);
        if (componentType == double.class)
            return Arrays.copyOf((double[]) array, length);
        if (componentType == float.class)
            return Arrays.copyOf((float[]) array, length);
        if (componentType == long.class)
            return Arrays.copyOf((int[]) array, length);
        if (componentType == boolean.class)
            return Arrays.copyOf((boolean[]) array, length);
        if (componentType == byte.class)
            return Arrays.copyOf((byte[]) array, length);
        if (componentType == short.class)
            return Arrays.copyOf((short[]) array, length);
        if (componentType == char.class)
            return Arrays.copyOf((char[]) array, length);
        if (componentType == String.class)
            return Arrays.copyOf((String[]) array, length);

        return null;
    }

    ///**
    // *
    // * copy:<br />
    // * 复制一个对象到另外一个
    // *
    // * @author mia
    // * @param org
    // * @param des
    // * @return
    // * @throws Exception
    // */
    //public static void copy(Object org, Object des) throws Exception {
    //
    //    Class<?> orgClassType = org.getClass();
    //    Class<?> desClassType = des.getClass();
    //
    //    //Object objectCopy = desClassType.getConstructor(new Class[]{}).newInstance(new Object[]{});
    //    Field[]fields = orgClassType.getDeclaredFields();
    //
    //    for (Field field : fields) {
    //        String filedName = field.getName();
    //        String firstLetter = filedName.substring(0, 1).toUpperCase();
    //        String getMethodName = "get" + firstLetter + filedName.substring(1);
    //        String setMethodName = "set" + firstLetter + filedName.substring(1);
    //
    //        Method getMethod = orgClassType.getMethod(getMethodName, new Class[]{});
    //        Method setMethod = desClassType.getMethod(setMethodName, new Class[]{field.getType()});
    //
    //        if (getMethod != null) {
    //            Object value = getMethod.invoke(org, new Object[]{});
    //            if (setMethod != null) {
    //                setMethod.invoke(des, new Object[]{value});
    //            }
    //        }
    //    }
    //}
}
