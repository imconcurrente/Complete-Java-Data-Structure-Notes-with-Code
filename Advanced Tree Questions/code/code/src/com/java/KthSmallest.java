package com.java;
import java.util.PriorityQueue;

public class KthSmallest {
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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        helper(root, minHeap, k);

        // remove k elements
        int ans = 0;
        for (int i = 0; i <k ; i++) {
            ans = minHeap.poll();

        }
        return ans;
    }
    private void helper(TreeNode node, PriorityQueue<Integer> minHeap, int k){
        if (node == null){
            return;
        }

        helper(node.left, minHeap, k);

        minHeap.offer(node.val);

        helper(node.right, minHeap, k);
    }
}
