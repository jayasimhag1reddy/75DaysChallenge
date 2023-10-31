package day12;
//https://leetcode.com/problems/trim-a-binary-search-tree/
public class Question669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null)return null;
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);
        if(root.val<low)return root.right;
        if(root.val>high)return root.left;
        return root;
    }
}
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
