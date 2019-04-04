package com.sjzc.javaTest.annotation;

import java.lang.annotation.*;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 18:07 2019/4/4
 */
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyAnnotation {

    String name() default "";
}
