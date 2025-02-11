package com.java;

import java.util.*;
// Hard question
public class VerticalOrderTraversal {
    public class TreeNode {
        int val;
       TreeNode left;
       TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // List to store the result
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        // HashMap to store column index as the key, and list of nodes at that column as the value
        Map<Integer, List<TreeNodeWithLevel>> map = new HashMap<>();

        // Queue for BFS traversal; stores nodes along with their column index and level
        Queue<TreeNodeWithLevel> queue = new LinkedList<>();

        // Start BFS with the root node at column 0 and level 0
        queue.offer(new TreeNodeWithLevel(root, 0, 0));

        // Perform BFS traversal
        while (!queue.isEmpty()) {
            TreeNodeWithLevel current = queue.poll();
            TreeNode node = current.node;
            int col = current.col;
            int level = current.level;

            // Add node to the map under its column index
            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(current);

            // Add left child to the queue
            if (node.left != null) {
                queue.offer(new TreeNodeWithLevel(node.left, col - 1, level + 1));
            }

            // Add right child to the queue
            if (node.right != null) {
                queue.offer(new TreeNodeWithLevel(node.right, col + 1, level + 1));
            }
        }

        // Sort columns based on the column index (keys)
        List<Integer> columns = new ArrayList<>(map.keySet());
        Collections.sort(columns);

        // Traverse the sorted columns
        for (int col : columns) {
            List<TreeNodeWithLevel> columnNodes = map.get(col);

            // Sort nodes at the same column first by level (top-to-bottom), then by value (left-to-right)
            columnNodes.sort((a, b) -> {
                if (a.level != b.level) {
                    return a.level - b.level;  // Sort by level first
                }
                return a.node.val - b.node.val;  // Sort by value if levels are the same
            });

            // Extract values from sorted nodes
            List<Integer> column = new ArrayList<>();
            for (TreeNodeWithLevel node : columnNodes) {
                column.add(node.node.val);
            }

            // Add the column to the result list
            ans.add(column);
        }

        return ans;
    }

    // Helper class to store the node along with its column index and level
    private static class TreeNodeWithLevel {
        TreeNode node;
        int col;
        int level;

        TreeNodeWithLevel(TreeNode node, int col, int level) {
            this.node = node;
            this.col = col;
            this.level = level;
        }
    }
}
