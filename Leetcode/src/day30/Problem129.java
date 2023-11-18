package day30;
//https://leetcode.com/problems/sum-root-to-leaf-numbers/
public class Problem129 {
    public int sumNumbers(TreeNode root) {
        int[] ans=new int[1];
        helper(root,0,ans);
        return ans[0];
    }
    public void helper(TreeNode root,int num,int[] ans){
        if(root==null)return;
        num=(num*10)+root.val;
        if(isLeaf(root)){
            ans[0]+=num;
            return;
        }
        helper(root.left,num,ans);
        helper(root.right,num,ans);
        num-=root.val;
        num/=10;
    }
    public boolean isLeaf(TreeNode node){
        return node.left==null && node.right==null;
    }
}
