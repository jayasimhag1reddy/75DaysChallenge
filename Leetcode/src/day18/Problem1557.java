package day18;

import java.util.*;

//https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
public class Problem1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans=new ArrayList<>();
        int[] ind=new int[n];
        for(List<Integer> al:edges){
            ind[al.get(1)]++;
        }
        for(int i=0;i<n;i++){
            if(ind[i]==0)ans.add(i);
        }
        return ans;
    }
}
