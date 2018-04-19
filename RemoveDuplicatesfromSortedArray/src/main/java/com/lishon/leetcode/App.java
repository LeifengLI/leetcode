package com.lishon.leetcode;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public int removeDuplicates(int[] nums) {
        int len = 0;
        for(int i=1; i<nums.length; i++){
            if (nums[i] != nums[len]) nums[++len] = nums[i];
        }
        return len+1;
    }
}
