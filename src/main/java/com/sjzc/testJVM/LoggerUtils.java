package com.sjzc.testJVM;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2017年9月05日 20:04:55
 */
public class LoggerUtils {

    private  static Person person = new Person();


    public static Person buildPerson(String s) {
        System.out.println(Thread.currentThread().getStackTrace());
        return new Person("张三", 1, Thread.currentThread().getStackTrace()[1].getClassName());
    }
}
