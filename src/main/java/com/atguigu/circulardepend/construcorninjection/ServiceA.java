package com.atguigu.circulardepend.construcorninjection;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author:
 * @CreateTime: 2021/7/16
 * @company:
 */
@Component
public class ServiceA {

    private ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
