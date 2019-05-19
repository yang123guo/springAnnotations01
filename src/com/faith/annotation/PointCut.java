package com.faith.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-20
 * @Description: com.faith.annotation
 * @version: 1.0
 */

@Component("point")
@Aspect
public class PointCut {

    // 先定义切点
    @Pointcut("execution(* com.faith.annotation.PointCut.definePoint())")
    public void definePoint() {
        System.out.println("我是一个切点");
    }
}
