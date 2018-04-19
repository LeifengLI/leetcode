package com.lishon.leetcode;

/**
 * Hello world!
 *
 */
public class App 
{
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int num = x;
        int tail = 0;
        int tmp = 0;
        while (x != 0) {
            tail = x % 10;
            if (((tmp * 10) / 10) == tmp) {
                tmp = (tmp * 10) + tail;
                x = x / 10;
            } else {
                return false;
            }
        }
        if (num == tmp) return true;
        return false;
    }
}
