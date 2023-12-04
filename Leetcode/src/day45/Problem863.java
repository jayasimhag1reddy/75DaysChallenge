package day45;

import java.util.*;

//https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
public class Problem863 {
    class Solution {
        public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
            HashMap<TreeNode,TreeNode> hm=new HashMap<>();
            markPar(root,hm);
            HashSet<TreeNode> hs=new HashSet<>();
            Queue<TreeNode> q=new LinkedList<>();
            q.add(target);
            hs.add(target);
            int lev=0;
            while(lev!=k){
                lev++;
                int si=q.size();
                while(si>0){
                    TreeNode temp=q.poll();
                    if(temp.left!=null && !hs.contains(temp.left)){
                        q.add(temp.left);
                        hs.add(temp.left);
                    }
                    if(temp.right!=null && !hs.contains(temp.right)){
                        q.add(temp.right);
                        hs.add(temp.right);
                    }
                    if(hm.get(temp)!=null && !hs.contains(hm.get(temp))){
                        q.add(hm.get(temp));
                        hs.add(hm.get(temp));
                    }
                    si--;
                }
            }
            List<Integer> ans=new ArrayList<>();
            while(!q.isEmpty()){
                ans.add(q.poll().val);
            }
            return ans;
        }
        public void markPar(TreeNode root,HashMap<TreeNode,TreeNode> hm){
            Queue<TreeNode> q=new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                    hm.put(temp.left,temp);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    hm.put(temp.right,temp);
                }
            }
        }
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
