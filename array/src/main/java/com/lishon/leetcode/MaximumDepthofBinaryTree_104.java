package com.lishon.leetcode;

import javax.management.MXBean;

/**
 * Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 For example:
 Given binary tree [3,9,20,null,null,15,7],

 3
 / \
 9  20
 /  \
 15   7
 return its depth = 3.
 * @author lishon
 * @create 2018-04-16 16:10
 **/

public class MaximumDepthofBinaryTree_104 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return  getDepth(root,0,0);
    }
    public static int getDepth(TreeNode t,Integer depth,int max) {
        /**
         *       1
         *      / \
         *     2  3
         *       / \
         *      4   5
         */
        if (t == null) return Math.max(depth,max);
        return  Math.max(getDepth(t.left, depth+1,Math.max(depth,max)),getDepth(t.right,depth+1,Math.max(depth,max)));
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

        /**
         *       1
         *      / \
         *     2  3
         *       / \
         *      4   5
         */
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
//        t2.left = t3;
//        t3.right = t4;
//        t2.right = t5;
//        t1.right = t6;

        int maxDepth = maxDepth(t1);
        System.out.println(maxDepth);
    }
}
