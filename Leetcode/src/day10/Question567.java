package day10;
//https://leetcode.com/problems/permutation-in-string/
public class Question567 {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())return false;
        int[] fr=new int[26];
        int[] fre=new int[26];
        for(int i=0;i<s1.length();i++){
            fr[s1.charAt(i)-'a']++;
            fre[s2.charAt(i)-'a']++;
        }
        if(isMatch(fr,fre))return true;
        for(int i=s1.length();i<s2.length();i++){
            fre[s2.charAt(i-s1.length())-'a']--;
            fre[s2.charAt(i)-'a']++;
            if(isMatch(fr,fre))return true;
        }
        return false;
    }
    public boolean isMatch(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
