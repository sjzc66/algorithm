package com.sjzc.functionCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 19:01 2019/3/7
 */
public class Student {
    private String name;
    private Byte sex;

    public Student(String name, Byte sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public void print() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        Student s1 = new Student("1", (byte) 1);
        Student s2 = new Student("2", (byte) 2);
        Student s3 = new Student("3", (byte) 3);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        list.forEach(s -> {
            s.setName("4");
            s.setSex((byte)0);
        });
        System.out.println("");

    }
}
