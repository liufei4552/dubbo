package com.cheyipai.service.impl;

import com.cheyipai.DemoService;

/**
 * @projectName: dubbo
 * @package: com.cheyipai.service.impl
 * @className: DemoServiceImpl
 * @author: liufei
 * @description: ${description}    功能描述
 * @date: 2019/8/5  15:34
 * @version: 1.0
 */
public class DemoServiceImpl implements DemoService{
    @Override
    public String getInfo(String name) {
        return "您输入的名字为:"+name;
    }
}
