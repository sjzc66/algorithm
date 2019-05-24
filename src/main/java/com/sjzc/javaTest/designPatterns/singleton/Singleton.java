package com.sjzc.javaTest.designPatterns.singleton;

/**
 * 禁止指令重排的单例模式
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 16:24 2019/3/26
 */
public class Singleton {
    public static int i = 1;

    private static volatile Singleton instance;         //1 volatile

    private Singleton() {}          //2  私有构造函数

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {        // 3 初始化时候锁定对象
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            long before=System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                Person person = new Person(i, "person" + i, "address" + i);
            }
            long after = (System.currentTimeMillis()-before);
            //System.out.print("耗时[ "+after+" ]ms-----------");

            long before2=System.currentTimeMillis();
            Person person = new Person();
            for (int j = 0; j < 1000000; j++) {
                person.setProperty(i, "person" + i, "address" + i);
            }
            long after2 = (System.currentTimeMillis()-before);
            //System.out.println("耗时[ "+after2+" ]ms");
            System.out.println(after - after2);
        }
    }
}

class Person{
    private int personId;
    private String personName;
    private String personAddress;

    public Person(){}

    public Person(int personId, String personName, String personAddress) {
        this.personId = personId;
        this.personName = personName;
        this.personAddress = personAddress;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public void setProperty(int personId, String personName, String personAddress) {
        this.personId = personId;
        this.personName = personName;
        this.personAddress = personAddress;
    }
}
