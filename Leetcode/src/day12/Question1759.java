package day12;
//https://leetcode.com/problems/count-number-of-homogenous-substrings/
public class Question1759 {
    public int countHomogenous(String s) {
        // int[] count=new int[26];
        int c=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i==0 || s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                // count[s.charAt(i-1)-'a']=(count[s.charAt(i-1)-'a']+helper(c));
                c=1;
            }
            ans=(ans+c)%1000000007;
        }
        // for(int i=0;i<26;i++){
        //     ans=(ans+count[i])%1000000007;
        // }
        return ans;
    }
}
