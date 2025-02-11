package com.java;

import java.util.HashSet;

public class TwoSumIV {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean findTarget(TreeNode node, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(node, k, set);
    }
    private boolean helper(TreeNode node, int k, HashSet<Integer> set){
        if (node == null){
            return false;
        }
        if (set.contains(k - node.val)){
            return true;
        }
        set.add(node.val);
        return helper(node.left, k, set) || helper(node.right, k, set);
    }
}
