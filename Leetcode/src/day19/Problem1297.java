package day19;

import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/
public class Problem1297 {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {

        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<=s.length()-minSize;i++){
            String str=s.substring(i,i+minSize);
            if(isValid(str,maxLetters)){
                hm.put(str,hm.getOrDefault(str,0)+1);
            }
        }
        int max=0;
        for(int i:hm.values()){
            max=Math.max(i,max);
        }
        return max;
    }
    public boolean isValid(String s,int let){
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        return hs.size()<=let;
    }
}
