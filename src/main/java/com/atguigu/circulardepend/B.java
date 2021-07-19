package com.atguigu.circulardepend;

/**
 * @Description:
 * @Author:
 * @CreateTime: 2021/7/16
 * @company:
 */
public class B {
    public A a;

    public B() {
        System.out.println("B....");
    }

    public void setA(A a) {
        this.a = a;
    }
}
