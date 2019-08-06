package com.cheyipai.service;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @projectName: dubbo
 * @package: com.cheyipai.service
 * @className: TestServiceTest
 * @author: liufei
 * @description: ${description}    功能描述
 * @date: 2019/8/6  10:36
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class TestServiceTest {
    /*@Reference*/
    @Autowired
    public TestService testService;
    @Test
    public void test1() {
        testService.test();
    }
}