package com.sjzc.functionCode;


/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 16:26 2018/11/28
 */
public class functionCodeTest {

    public static void main(String[] args) {
        //List<Student> list = new ArrayList<Student>();
        //list.add(new Student("张三", (byte) 0));
        //list.add(new Student("李四", (byte) 1));
        //
        //List<Student> collect = list.stream().filter(s -> s.getSex() == (byte) 0).collect(Collectors.toList());
        //System.out.println(collect.size());
        //for (int i = 0; i < collect.size(); i++) {
        //    collect.get(i).print();
        //}
        //List<String> collected1 = Stream.of("a", "b", "c")
        //        .collect(toList());
        //
        //List<String> collected2 = Stream.of("a", "b", "hello")
        //        .map(string -> string.toUpperCase())
        //        .collect(toList());
        //
        //int result = 24;
    }

}


class Student {
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
