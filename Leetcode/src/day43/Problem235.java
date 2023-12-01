package day43;
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
public class Problem235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if((root.val>p.val && root.val<q.val) || (root.val>q.val && root.val<p.val) || root.val==p.val || root.val==q.val){
            return root;
        }
        if(p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val>root.val && q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return null;
    }
}
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
