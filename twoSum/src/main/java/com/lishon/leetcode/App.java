package com.lishon.leetcode;

/**
 * Hello world!
 *
 */
public class App 
{
    public int[] twoSum(int[] nums, int target) throws Exception {
        int[] answer = new int[2];
        boolean hasAnswer = false;
        for (int i =0; i < nums.length - 1;i++) {
            for (int k = i+1; k < nums.length;k++) {
                if ( nums[i] + nums[k] == target) {
                    answer[0] = i;
                    answer[1] = k;
                    hasAnswer = true;
                    break;
                }
            }
        }
        if (!hasAnswer) {
            throw new Exception("no answer!");
        }
        return answer;
    }
}
