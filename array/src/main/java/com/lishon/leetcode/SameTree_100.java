package com.lishon.leetcode;

/**
 * Given two binary trees, write a function to check if they are the same or not.

 Two binary trees are considered the same if they are structurally identical and the nodes have the same value.


 Example 1:

 Input:     1         1
 / \       / \
 2   3     2   3

 [1,2,3],   [1,2,3]

 Output: true
 Example 2:

 Input:     1         1
 /           \
 2             2

 [1,2],     [1,null,2]

 Output: false
 Example 3:

 Input:     1         1
 / \       / \
 2   1     1   2

 [1,2,1],   [1,1,2]

 Output: false
 * @author lishon
 * @create 2018-04-16 14:26
 **/


import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class SameTree_100 {

      static class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> l =  new ArrayList<>();
        List<Integer> l2 =  new ArrayList<>();
        treeToList(p,l);
        treeToList(q,l2);
        final boolean equals = Arrays.equals(l.toArray(), l2.toArray());
        System.out.print(JSON.toJSON(l)+"--"+JSON.toJSON(l2));
        System.out.println(equals);
        return  equals;
    }

    public static void treeToList(TreeNode t,List<Integer> l) {
        l.add(t.val);
          if(t.left != null) {
            treeToList(t.left,l);
            if (t.right != null) {
                treeToList(t.right,l);
            }
          } else {
              if (t.right != null) {
                  l.add(null);
                  treeToList(t.right,l);
              }
          }
    }

    public static void main(String[] args){

        /**
         *         1
         *        / \
         *       2   6
         *      / \
         *     3   5
         *      \
         *       4
         *  [1,2,3,null,4,5,6]
         */
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(1);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        /*t1.left = t2;
        t2.left = t3;
        t3.right = t4;
        t2.right = t5;
        t1.right = t6;*/
        t1.left = t2;
        t3.right = t4;
        isSameTree(t1,t3);
    }
}
