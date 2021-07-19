package com.atguigu.circulardepend.construcorninjection;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author:
 * @CreateTime: 2021/7/16
 * @company:
 */
@Component
public class ServiceB {
    private ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
