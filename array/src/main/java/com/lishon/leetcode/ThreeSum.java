package com.lishon.leetcode;

import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 S，是否存在属于 S 的三个元素 a，b，c 使得 a + b + c = 0 ？找出所有不重复的三个元素组合使三个数的和为零
 *
 * @author lishon
 * @create 2018-04-10 11:41
 **/

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i =0;i < nums.length -2 ;i++) {
            System.out.println();
            Map<Integer ,Integer> map = new HashMap<>();
            for (int j = i +1;j<nums.length -1;j++) {
                if (!map.containsKey(0 - nums[i] - nums[j])) {
                    map.put(nums[j],j);
                } else {
                    List<Integer> rl = new ArrayList<>();
                    rl.add(nums[i]);
                    rl.add(0 - nums[i] - nums[j]);
                    rl.add(nums[j]);
                    result.add(rl);
                };
            }
        }
        return  result;
    }
}
