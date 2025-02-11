package com.java;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
//Q2:
public class AvgOfBFS {

    // Define the TreeNode class
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public List<Double> levelOrder(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // Queue to store nodes for BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double averageLevel = 0;

            // Process each node at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                averageLevel += currentNode.val;

                // Add left child to the queue
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                // Add right child to the queue
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            // Calculate average and add it to the result
            averageLevel = averageLevel / levelSize;
            result.add(averageLevel);
        }

        return result;
    }

}
