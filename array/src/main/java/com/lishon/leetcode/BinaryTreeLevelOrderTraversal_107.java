package com.lishon.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its bottom-up level order traversal as:
 [
 [15,7],
 [9,20],
 [3]
 ]
 * @author lishon
 * @create 2018-04-16 17:47
 **/

public class BinaryTreeLevelOrderTraversal_107 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result =  new ArrayList<>();
        getDepth(root,1,result);
        return result;
    }

    public  static void getDepth(TreeNode t, Integer depth,List<List<Integer>> result) {
        if (t == null) return;
        List<Integer> l = null;
        int size = result.size();
        if(depth > size) {
            l = new ArrayList<>();
            result.add(0,l);
        } else {
            l = result.get(size - depth);
        }
        l.add(t.val);
        getDepth(t.left,depth+1,result);
        getDepth(t.right,depth+1,result);
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
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        t1.left = t2;
        t2.left = t3;
        t3.right = t4;
        t2.right = t5;
        t1.right = t6;
        List<List<Integer>> lists = levelOrderBottom(t1);
        System.out.println(JSON.toJSON(lists));
    }

}
