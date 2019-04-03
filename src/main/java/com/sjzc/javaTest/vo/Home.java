package com.sjzc.javaTest.vo;

import lombok.Data;

import java.util.List;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 10:43 2019/3/8
 */
@Data
public class Home {

    private int personSize;
    private final Person person;

    public Home(int personSize, Person person) {
        this.personSize = personSize;
        this.person = person;
    }

    public static void main(String[] args) {
        //Address address = new Address();
        //address.setProvince("000");
        //address.setCity("001");
        //address.setAddress("惠新西街");
        //Person person = new Person(26, true, address);
        //Person person1 = new Person(28, false, address);
        //
        //Home home = new Home(1, person);
        //System.out.println(home);
        //
        //Address address1 = new Address();
        //address1.setProvince("1000");
        //address1.setCity("1001");
        //address1.setAddress("惠新西街111");
        //person.setAddress(address1);
        //System.out.println(home);
    }

}
