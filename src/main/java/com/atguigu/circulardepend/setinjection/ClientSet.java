package com.atguigu.circulardepend.setinjection;

/**
 * @Description:
 * @Author:
 * @CreateTime: 2021/7/16
 * @company:
 */
public class ClientSet {
    public static void main(String[] args) {
        ServiceAA serviceAA = new ServiceAA();
        ServiceBB serviceBB = new ServiceBB();
        serviceAA.setServiceAA(serviceBB);
        serviceBB.setServiceAA(serviceAA);
    }
}
