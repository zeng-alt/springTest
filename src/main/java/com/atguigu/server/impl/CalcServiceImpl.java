package com.atguigu.server.impl;

import com.atguigu.server.CalcService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author:
 * @CreateTime: 2021/7/16
 * @company:
 */
@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public int div(int x, int y) {
        int result = x / y;

        System.out.println("    =====> CalcServiceImpl被调用了，我们的计算结果：" + result);

        return 0;
    }
}
