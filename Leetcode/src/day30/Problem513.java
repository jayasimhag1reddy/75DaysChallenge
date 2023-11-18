package day30;

import java.util.*;

//https://leetcode.com/problems/find-bottom-left-tree-value/
public class Problem513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int res=0;
        while(!q.isEmpty()){
            int si=q.size();
            boolean flag=true;
            while(si>0){
                TreeNode temp=q.poll();
                if(flag){
                    res=temp.val;
                    flag=false;
                }
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                si--;
            }
        }
        return res;
    }
}
