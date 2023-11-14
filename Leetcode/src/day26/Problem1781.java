package day26;
//https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
public class Problem1781 {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[] fre=new int[26];
            for(int j=i;j<s.length();j++){
                fre[s.charAt(j)-'a']++;
                ans+=helper(fre);
            }
        }
        return ans;
    }

    public int helper(int[] fre){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(fre[i]!=0){
                min=Math.min(min,fre[i]);
                max=Math.max(max,fre[i]);
            }
        }
        return max-min;
    }
}
