package day22;

import java.util.*;

//https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/
public class Problem2150 {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Integer> al=new ArrayList<>();
        for(int i:hm.keySet()){
            if(hm.get(i)==1 && !hm.containsKey(i-1) && !hm.containsKey(i+1)){
                al.add(i);
            }
        }
        return al;
    }
}
