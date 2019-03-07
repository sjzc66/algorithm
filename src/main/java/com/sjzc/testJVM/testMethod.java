package com.sjzc.testJVM;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 14:34 2019/2/19
 */
public class testMethod {

    public static void main(String[] args) {

        Person person = LoggerUtils.buildPerson("hhh");
        System.out.println(person.getRemark());
        //Person person = new Person("张三", 25,"111");
        ////person.print();
        //for (int i = 0; i < 1000; i++) {
        //    final int finalI = i;
        //    Thread thread = new Thread(new Runnable() {
        //        public void run() {
        //            try {
        //                Thread.sleep(100);
        //            } catch (InterruptedException e) {
        //                e.printStackTrace();
        //            }
        //            Person.age = finalI;
        //            System.out.println(Person.age);
        //        }
        //    });
        //    thread.start();
        //}
    }
}

class Person {
    private String name;
    private int sex;
    public static int age;
    private String remark;


    public Person() {
    }

    public Person(String name, int sex,String remark) {
        this.name = name;
        this.sex = sex;
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void print() {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(method);
        System.out.println("name=" + name + ",sex" + sex);
    }
}
