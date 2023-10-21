package day2;

import java.util.*;

//https://leetcode.com/problems/unique-number-of-occurrences/
public class Question1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i:hm.values()){
            hs.add(i);
        }
        return hs.size()==hm.size();
    }
}
