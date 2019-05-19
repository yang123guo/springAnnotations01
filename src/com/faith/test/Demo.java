package com.faith.test;

import org.springframework.stereotype.Component;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-19
 * @Description: com.faith.test
 * @version: 1.0
 */

@Component("demo")
public class Demo {

    public void getName() {
        System.out.println("输入demo");
    }
}
