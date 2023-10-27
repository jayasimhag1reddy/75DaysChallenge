package day8;

import java.util.*;

//https://leetcode.com/problems/course-schedule/
public class Question207 {
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<n;i++)al.add(new ArrayList<>());
        for(int[] ar:pre)al.get(ar[0]).add(ar[1]);
        int[] ind=new int[n];
        for(int[] ar:pre){
            ind[ar[1]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        int c=0;
        while(!q.isEmpty()){
            int temp=q.poll();
            c++;
            for(int i:al.get(temp)){
                ind[i]--;
                if(ind[i]==0)q.add(i);
            }
        }
        return c==n;
    }
}
