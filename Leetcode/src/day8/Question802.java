package day8;

import java.util.*;

//https://leetcode.com/problems/find-eventual-safe-states/
public class Question802 {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        Queue<Integer> q=new LinkedList<>();
        int[] ind=new int[n];
        for(int i=0;i<n;i++){
            for(int j:graph[i]){
                al.get(j).add(i);

            }
            if(graph[i].length==0){
                q.add(i);
            }
            ind[i]=graph[i].length;
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int temp=q.poll();
            ans.add(temp);
            for(int i:al.get(temp)){
                ind[i]--;
                if(ind[i]==0){
                    q.add(i);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
