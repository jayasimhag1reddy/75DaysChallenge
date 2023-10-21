package day2;
//https://leetcode.com/problems/delete-node-in-a-bst/
class TreeNode {
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
public class Question450 {
    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            TreeNode temp = root;
            if (root == null) return root;
            else if (root.val == key) {
                return delete(root);
            }
            while (root != null) {
                if (root.left != null && root.left.val == key) {
                    root.left = delete(root.left);
                    break;
                } else if (root.right != null && root.right.val == key) {
                    root.right = delete(root.right);
                    break;
                }
                if (root.val > key) {
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
            return temp;
        }

        public TreeNode delete(TreeNode root) {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            TreeNode leftRight = getLeft(root.right);
            leftRight.left = root.left;
            return root.right;
        }

        public TreeNode getLeft(TreeNode node) {
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
    }
}
