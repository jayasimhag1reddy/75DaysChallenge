package day16;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-elements/
public class Problem347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Integer>[] bkt=new List[nums.length+1];
        for(int i:hm.keySet()){
            if(bkt[hm.get(i)]==null){
                bkt[hm.get(i)]=new ArrayList<>();
            }
            bkt[hm.get(i)].add(i);
        }
        int[] ans=new int[k];
        int p=0;
        for(int i=nums.length;i>=0 && k>0;i--){
            if(bkt[i]!=null){
                for(int j:bkt[i]){
                    ans[p++]=j;
                    k--;
                }
            }
        }
        return ans;
    }
}
