package com.lishon.leetcode;

/**
 * Given an array and a value, remove all instances of that value in-place and return the new length.  Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.  The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 * @author lishon
 * @create 2018-04-12 9:55
 **/

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) nums[pos++] = nums[i];
        }
        return pos;
    }
}
