package com.lishon.leetcode;

/**
 * @author lishon
 * @create 2018-04-10 14:21
 **/

public class ReversInteger {

    public int reverse(int x) {
        Double r = 0.0;
        while (x != 0 ) {
            x = x /10;
            r = r * 10 + x % 10;
        }
        return r > Integer.MAX_VALUE || r < Integer.MIN_VALUE ? 0:r.intValue();
    }

}
