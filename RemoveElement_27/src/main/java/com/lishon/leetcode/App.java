package com.lishon.leetcode;

/**
 * Hello world!
 *
 */
public class App 
{
    public int removeElement(int[] nums, int val) {
        int len = 0;
        for (int i =0;i<nums.length ;i++) {
            if (nums[i] != val) {
                nums[len] = nums[i];
                len++;
            }
        }
        return len;
    }
}
