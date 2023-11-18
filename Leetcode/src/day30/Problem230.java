package day30;

import java.util.Stack;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class Problem230 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st=new Stack<>();
        while(true){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            root=st.pop();
            k=k-1;
            if(k==0){
                return root.val;
            }
            root=root.right;
        }
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