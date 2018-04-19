package com.lishon.leetcode;

/**
 * @author lishon
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
 * @create 2018-04-12 15:09
 **/

public class PlusOne_66 {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1 ;i >= 0;i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        //如果执行到这来说明第一位为9需要进位扩展数组
        int[] newNumber = new int [len+1];
        newNumber[0] = 1;

        return  newNumber;
    }
}
