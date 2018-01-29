package com.lishon.leetcode;

import com.alibaba.fastjson.JSON;
import sun.security.provider.Sun;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result =  new ArrayList<List<Integer>>();
        Set<List<Integer>> listSet = new HashSet<List<Integer>>();
        int i = 0;
        while(i < nums.length - 2) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k ) {
                int sum = 0 - nums[k];
                if (nums[i] + nums[j] == sum) {
                    listSet.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    if (nums[i] == nums[j]) {
                        i++;
                        j++;
                        continue;
                    }
                    if (nums[j] == sum) {
                        k--;
                        continue;
                    }
                    j++;

                } else if (nums[i] + nums[j] < sum) {
                    j++;
                    continue;
                } else {
                    k--;
                    continue;
                }
            }
            i++;
        }
        result.addAll(listSet);
        return result;
    }
}
