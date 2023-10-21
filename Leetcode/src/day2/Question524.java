package day2;

import java.util.List;
//https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
public class Question524 {
    public String findLongestWord(String s, List<String> dic) {
        String ans="";
        for(String str:dic){
            if(isFound(str,s)){
                if(str.length()>ans.length() || (str.length()==ans.length() && str.compareTo(ans)<0)){
                    ans=str;
                }
            }
        }
        return ans;
    }
    public boolean isFound(String str,String s){
        int j=0;
        for(int i=0;i<s.length() && j<str.length();i++){
            if(s.charAt(i)==str.charAt(j)){
                j++;
            }
        }
        return j==str.length();
    }
}
