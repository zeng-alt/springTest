package com.atguigu.circulardepend.setinjection;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author:
 * @CreateTime: 2021/7/16
 * @company:
 */
@Component
public class ServiceAA {
    private ServiceBB serviceBB;

    public void setServiceAA(ServiceBB serviceBB) {
        this.serviceBB = serviceBB;
        System.out.println("A 里面设置了B");
    }
}
