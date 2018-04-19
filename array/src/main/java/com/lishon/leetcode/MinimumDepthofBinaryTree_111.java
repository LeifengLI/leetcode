package com.lishon.leetcode;

/**Given a binary tree, find its minimum depth.

 The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * @author lishon
 * @create 2018-04-17 15:07
 **/

public class MinimumDepthofBinaryTree_111 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int minDepth(TreeNode root) {
        if (root == null ) return 0;
        if (root.left == null && root.right == null) return 1;
        return Math.min(getMinDepth(root.left,2),getMinDepth(root.right,2));
    }

    public int getMinDepth(TreeNode t,int depth) {
        if (t == null) return Integer.MAX_VALUE;
        if (t.left == null && t.right == null) return depth;
        if (t.left == null) return getMinDepth(t.right,depth+1);
        if (t.right == null) return getMinDepth(t.left,depth+1);
        return Math.min(getMinDepth(t.left,depth+1),getMinDepth(t.right,depth+1));
    }

}
