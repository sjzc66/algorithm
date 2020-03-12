package com.sjzc.testJVM;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 14:34 2019/2/19
 */
public class java {

    //public static void main(String[] args) {
    //    System.out.println("Y" + "O");
    //    System.out.println('L' + 'O');
    //    Integer dd = (Integer) null;
    //    System.out.println(dd);
    //
    //    Integer i = null;
    //    Integer j = 10;
    //    //prints falsett
    //    System.out.println(i instanceof Integer);
    //    //Compiles successfully
    //    System.out.println(j instanceof Integer);
    //
    //}

    //public static void main(String[] args) {
    //    Map map = new LinkedHashMap();
    //    map.put("1", 1);
    //    map.put("2", 2);
    //    map.put("3", 3);
    //    map.put("4", 4);
    //    map.put("5", 5);
    //    System.out.println(map.toString());
    //}


    //public static void main(String[] args) {
    //    int i = 0;
    //    int j = 0;
    //    System.out.println("-----");
    //    i = i + 1;
    //    System.out.println("-----");
    //    i++;
    //    System.out.println("-----");
    //}

    public static void main(String[] args) {
        boolean s = java.s();
        System.out.println("-------");
        System.out.println(s);

        Stack stack = new Stack();
        stack.peek();
        stack.pop();
        stack.push("1");

        Queue queue = new LinkedBlockingQueue();
        queue.add(1);


    }

    private static boolean s(){
        try {
            boolean success = false;
            if (success == true) {
                return true;
            }else {
                System.out.println("if-else");
                System.out.println(1/0);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
        return false;
    }
}
