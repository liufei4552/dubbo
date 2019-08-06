package com.cheyipai.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cheyipai.DemoService;
import com.cheyipai.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: dubbo
 * @package: com.cheyipai.service.impl
 * @className: TestServiceImpl
 * @author: liufei
 * @description: ${description}    功能描述
 * @date: 2019/8/6  10:24
 * @version: 1.0
 */
@Service
public class TestServiceImpl implements TestService{
    @Autowired
    public DemoService demoService;
    @Override
    public void test() {
        String str=demoService.getInfo("刘飞");
        System.out.println(str);
    }
}
