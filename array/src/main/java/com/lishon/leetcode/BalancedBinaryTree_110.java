package com.lishon.leetcode;

/**
 * Given a binary tree, determine if it is height-balanced.

 For this problem, a height-balanced binary tree is defined as:

 a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

 Example 1:

 Given the following tree [3,9,20,null,null,15,7]:

 3
 / \
 9  20
 /  \
 15   7
 Return true.

 Example 2:

 Given the following tree [1,2,2,3,3,null,null,4,4]:

 1
 / \
 2   2
 / \
 3   3
 / \
 4   4
 Return false.
 * @author lishon
 * @create 2018-04-17 12:06
 **/

public class BalancedBinaryTree_110 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        return Math.abs(getDepth(root.left,1,1)-getDepth(root.right,1,1)) <=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    //获取当前节点为根节点的树的深度
    public static int getDepth(TreeNode t, int depth, int max) {
        if (t == null) return Math.max(depth,max);
        return Math.max(getDepth(t.left,depth+1,Math.max(depth,max)),getDepth(t.right,depth+1,Math.max(depth,max)));
    }

    public static void main(String[] args){
        /**
         *         1
         *        / \
         *       2   2
         *      /     \
         *     3       3
         *    /         \
         *   4           4
         *
         */
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(3);
        TreeNode t7 = new TreeNode(4);

        t1.left = t2;
        t2.left = t3;
        t3.left = t4;
        t1.right = t5;
        t5.right = t6;
        t6.right = t7;
        boolean balanced = isBalanced(t1);
        System.out.println(balanced);
    }
}
