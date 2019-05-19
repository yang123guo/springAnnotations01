package com.faith.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-20
 * @Description: com.faith.annotation
 * @version: 1.0
 */
public class TestAn {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        PointCut point = ac.getBean("point", PointCut.class);
        point.definePoint();
    }
}
