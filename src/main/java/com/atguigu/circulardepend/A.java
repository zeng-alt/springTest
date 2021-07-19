package com.atguigu.circulardepend;

/**
 * @Description:
 * @Author:
 * @CreateTime: 2021/7/16
 * @company:
 */
public class A {
    public B b;

    public A(){
        System.out.println("A....");
    }

    public void setB(B b) {
        this.b = b;
    }
}
