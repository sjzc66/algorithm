package com.sjzc.javaTest.annotation;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 18:07 2019/4/4
 */
@MyAnnotation(name = "测试")
public class MyAnnotationUse {

    public static void main(String[] args) {
        MyAnnotation annotation = (MyAnnotation) MyAnnotationUse.class
                .getAnnotation(MyAnnotation.class);
        System.out.println(annotation);// 打印MyAnnotation对象，这里输出的结果为：@cn.itcast.day2.MyAnnotation()
    }

}
