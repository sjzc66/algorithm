package com.sjzc.functionCode;

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
}
