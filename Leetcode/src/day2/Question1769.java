package day2;

import java.util.*;

//https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
public class Question1769 {
    public int[] minOperations(String b) {
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1'){
                al.add(i);
            }
        }
        int[] ans=new int[b.length()];
        for(int i=0;i<b.length();i++){
            ans[i]=getAns(al,i);
        }
        return ans;
    }
    public int getAns(List<Integer> al,int in){
        int ans=0;
        for(int i:al){
            ans+=Math.abs(i-in);
        }
        return ans;
    }
}
