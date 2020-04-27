package com.sjzc.testJVM;

import org.openjdk.jol.info.ClassLayout;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochong
 * @Description
 * @create: 2020-03-29 11:44
 **/
public class TestSize {
    static Object generate() {
        Map<String, Object> map = new HashMap<>();
        map.put("a", new Integer(1));
        map.put("b", "b");
        map.put("c", new Date());

        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }
        return map;
    }

    static void print(String message) {
        System.out.println(message);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Object obj = generate();
        Integer a = new Integer(1);
        Long b = new Long(1);
        Boolean c = new Boolean(true);
        Double d = new Double(1L);

        System.out.println(ClassLayout.parseInstance(a).toPrintable());
        System.out.println("--------------");
        System.out.println(ClassLayout.parseInstance(b).toPrintable());
        System.out.println("--------------");
        System.out.println(ClassLayout.parseInstance(c).toPrintable());
        System.out.println("--------------");
        System.out.println(ClassLayout.parseInstance(d).toPrintable());

        // //查看对象内部信息
        // print(ClassLayout.parseInstance(obj).toPrintable());
        //
        // //查看对象外部信息
        // print(GraphLayout.parseInstance(obj).toPrintable());
        //
        // //获取对象总大小
        // print("size : " + GraphLayout.parseInstance(obj).totalSize());
    }
}

