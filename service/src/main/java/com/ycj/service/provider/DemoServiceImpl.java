package com.ycj.service.provider;

import com.ycj.service.DemoService;


public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}