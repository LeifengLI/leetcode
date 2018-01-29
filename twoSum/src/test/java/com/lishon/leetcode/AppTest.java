package com.lishon.leetcode;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
     public static void main(String[] args){
         App app = new App();

         int nums[] = new int[]{1,2,3};

         try {
             int[] ints = app.twoSum(nums, 5);
             System.out.println(JSON.toJSON(ints));
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }

     }
}
