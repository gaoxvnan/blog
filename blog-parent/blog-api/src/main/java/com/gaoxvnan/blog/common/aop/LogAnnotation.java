package com.gaoxvnan.blog.common.aop;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
public @interface LogAnnotation {

    String module() default  "";

    String operator() default "";

}
