package com.java;

import java.util.HashMap;

public class PreInOrderTraversal {
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
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Building the map to get the index of each element in inorder traversal
        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }

        int[] index = {0}; // This is used to track the current root in preorder

        return helper(preOrder, inOrder, 0, preOrder.length - 1, map, index);
    }

    public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map, int[] index) {
        if (left > right) {
            return null; // Base case: if left exceeds right, no node to construct
        }

        // Get the current root from preorder traversal
        int current = preOrder[index[0]];
        index[0]++; // Move to the next element in preorder

        TreeNode node = new TreeNode(current);

        if (left == right) {
            return node; // If only one element, it's a leaf node
        }

        // Find the index of the current root in inorder traversal
        int inOrderIndex = map.get(current);

        // Recursively build the left and right subtrees
        node.left = helper(preOrder, inOrder, left, inOrderIndex - 1, map, index);
        node.right = helper(preOrder, inOrder, inOrderIndex + 1, right, map, index); // Fixed the order of parameters

        return node;
    }

}
