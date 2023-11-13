package day25;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/even-odd-tree/
public class Problem1609 {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int lev=0;
        while(!q.isEmpty()){
            int si=q.size();
            // List<Integer> al=new ArrayList<>();
            int min=0;
            int max=Integer.MAX_VALUE;
            while(si>0){
                TreeNode temp=q.poll();
                if(lev%2==0){
                    if(temp.val%2==0 || temp.val<=min){
                        return false;
                    }
                    min=temp.val;
                }
                else{
                    if(temp.val%2!=0 || temp.val>=max){
                        return false;
                    }
                    max=temp.val;
                }
                // al.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                si--;
            }

            lev++;
        }
        return true;

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