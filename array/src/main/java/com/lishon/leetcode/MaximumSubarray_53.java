package com.lishon.leetcode;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.

 * @author lishon
 * @create 2018-04-12 14:31
 **/

public class MaximumSubarray_53 {

    public static int maxSubArray(int[] nums) {
        int lagest = nums[0];
        int sum = nums[0];
        for (int i = 1;i<nums.length;i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            lagest =  Math.max(sum,lagest);
        }
        return lagest;
    }

    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(arr);
    }
}
