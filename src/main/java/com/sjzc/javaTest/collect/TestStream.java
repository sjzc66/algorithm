package com.sjzc.javaTest.collect;

import com.sjzc.functionCode.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhaochong
 * @Description
 * @create: 2019-07-04 15:26
 **/
public class TestStream {

    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", (byte) 1);
        Student s2 = new Student("lisi", (byte) 1);
        List<Student> ls = new ArrayList<>();
        ls.add(s1);
        ls.add(s2);

        List<String> rtn = new ArrayList<>();
        for (Student s : ls) {
            rtn.add(s.getName());
        }
        List<String> collect = ls.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(collect);
    }
}
