package com.atguigu;

import com.atguigu.server.CalcService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author:
 * @CreateTime: 2021/7/16
 * @company:
 */
@SpringBootTest
//@RunWith(SpringRunner.class)
public class TestAop {
    @Resource
    private CalcService calcService;

    @Test
    public void testAop4() {
        System.out.println("spring版本：" + SpringVersion.getVersion() + "\t springboot版本" + SpringBootVersion.getVersion());
        calcService.div(10, 0);
    }

    @Test
    public void testAop5() {
        System.out.println("spring版本：" + SpringVersion.getVersion() + "\t springboot版本" + SpringBootVersion.getVersion());
        calcService.div(10, 0);
    }
}
