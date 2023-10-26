package day7;

import java.util.*;

//https://leetcode.com/problems/words-within-two-edits-of-dictionary/
public class Question2452 {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans=new ArrayList<>();
        for(String s:queries){
            for(String str:dictionary){
                if(isEdit(s,str)){
                    ans.add(s);
                    break;
                }
            }
        }
        return ans;
    }
    public boolean isEdit(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        int c=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))c++;
        }
        return c<=2;
    }
}
