package com.maqh.utils.random;

import java.util.Random;

/**
 * 随机数的一些操作
 *
 * @author maqh
 * @version 1.0
 * @date 2021-08-30
 */
public class RanDom {

    /**
     * 获取指定长度的code
     *
     * @param len 长度
     * @return 返回指定长度的code
     */
    public static String getCode(int len) {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            str.append(random.nextInt(9));
        }
        return str.toString();
    }
}
