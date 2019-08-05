package com.cheyipai.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @projectName: dubbo
 * @package: com.cheyipai.test
 * @className: Test
 * @author: liufei
 * @description: ${description}    功能描述
 * @date: 2019/8/5  15:52
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        ac.start();
        System.out.println("启动成功..................");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
