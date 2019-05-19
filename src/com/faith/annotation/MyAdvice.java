package com.faith.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-19
 * @Description: com.faith.annotation
 * @version: 1.0
 */
@Aspect
public class MyAdvice {

    @Before("com.faith.annotation.PointCut.definePoint()")
    public void myBefore() {
        System.out.println("我是前置方法");
    }

    @After("com.faith.annotation.PointCut.definePoint()")
    public void myAfter() {
        System.out.println("我是后置方法");
    }
}
