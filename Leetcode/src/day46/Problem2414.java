package day46;
//https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/
public class Problem2414 {
    public int longestContinuousSubstring(String s) {
        int ans=0;
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)-s.charAt(i-1)==1){
                c++;
            }
            else{
                ans=Math.max(ans,c);
                c=1;
            }
        }
        return Math.max(ans,c);
    }
}
