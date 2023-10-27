package day8;

import java.util.HashMap;

//https://leetcode.com/problems/number-of-matching-subsequences/
public class Question792 {
    public int numMatchingSubseq(String s, String[] words) {

        HashMap<String,Integer> hm=new HashMap<>();
        for(String st:words){
            hm.put(st,hm.getOrDefault(st,0)+1);
        }
        int ans=0;
        for(String st:hm.keySet()){
            if(isSub(s,st)){
                ans+=hm.get(st);
            }
        }
        return ans;
    }
    public boolean isSub(String str1,String str2){
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }
            i++;
        }
        return j==str2.length();
    }
}
