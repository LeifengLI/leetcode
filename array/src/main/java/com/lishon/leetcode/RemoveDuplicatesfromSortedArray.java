package com.lishon.leetcode;

/**
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * @author lishon
 * @create 2018-04-12 9:32
 **/

public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int pos = 0;
        for (int i = 1; i <= nums.length -1 ; i++) {
            if (nums[pos] != nums[i]) {
                nums[++pos] = nums[i];
            }
        }
        return ++pos;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2};
        removeDuplicates(nums);
    }

}
