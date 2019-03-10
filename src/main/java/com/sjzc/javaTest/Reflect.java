package com.sjzc.javaTest;

import com.sjzc.javaTest.vo.Person;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 10:29 2019/3/9
 */
public class Reflect {

    private class innerClass {
        private static final int ss = 0;
    }


    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setSex(false);

        Class clazz = person.getClass();
        Field[] fields = clazz.getDeclaredFields();
        try {
            for (Field field : fields) {
                String key = field.getName();

                PropertyDescriptor descriptor = new PropertyDescriptor(key, clazz);
                Method method = descriptor.getReadMethod();
                Object invoke = method.invoke(person);
                System.out.println(key + ":" + invoke);

            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
