package com.lishon.leetcode;

/**
 * Hello world!
 *
 */
public class App 
{
    public int reverse(int x) {
        int tmp = 0;
        while (x != 0) {
            //防止结果溢出， 如果结果*10 超过 Integer.MAX_VALUE 或者 Integer.MIN_VALUE则再除以10 和原数据不相等
            if (((tmp * 10) / 10) == tmp) {
                tmp = (tmp * 10) + x % 10;
                x = x / 10;
            } else {
                return 0;
            }
        }
        return tmp;
    }
}
