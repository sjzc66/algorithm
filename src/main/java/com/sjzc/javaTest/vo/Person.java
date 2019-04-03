package com.sjzc.javaTest.vo;

import lombok.Data;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 10:43 2019/3/8
 */
@Data
public class Person {

    //private final int age;
    //private final boolean sex;
    private int age;
    private boolean sex;
    private Address address;

    //public Person(int age, boolean sex, Address address) {
    //    this.age = age;
    //    this.sex = sex;
    //    this.address = address;
    //}

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
