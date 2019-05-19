package com.faith.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-19
 * @Description: 测试类
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] names = ac.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println("name是：" + name);
        }

        // 此时括号里面第一个参数就是 @Component里面的命名
        Demo demo = ac.getBean("demo", Demo.class);
        demo.getName();
    }
}
