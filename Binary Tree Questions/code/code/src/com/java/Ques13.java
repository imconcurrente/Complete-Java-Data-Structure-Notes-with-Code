package com.java;

public class Ques13 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        // Find the middle index to ensure balanced BST
        int mid = (start + end) / 2;

        // Create the root node with the middle element
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively build the left subtree
        root.left = sortedArrayToBSTHelper(nums, start, mid - 1);

        // Recursively build the right subtree
        root.right = sortedArrayToBSTHelper(nums, mid + 1, end);

        return root;
    }
}
