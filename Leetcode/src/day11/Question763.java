package day11;

import java.util.*;

//https://leetcode.com/problems/partition-labels/
public class Question763 {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndex=new int[26];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        int i=0;
        int j=0;
        int k=0;
        List<Integer> ans=new ArrayList<>();
        while(i<s.length()){
            j=lastIndex[s.charAt(k)-'a'];
            while(k!=j){
                if(lastIndex[s.charAt(k)-'a']>j){
                    j=lastIndex[s.charAt(k)-'a'];
                }
                k++;
            }
            ans.add(k-i+1);
            i=k+1;
            k++;
        }
        return ans;
    }
}
