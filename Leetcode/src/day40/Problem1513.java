package day40;
//https://leetcode.com/problems/number-of-substrings-with-only-1s/
public class Problem1513 {
    public int numSub(String s) {
        int ans=0;
        int c=0;
        int mod=1000000007;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
                ans=(ans+c)%mod;
            }
            else{
                c=0;
            }
        }
        return ans%mod;
    }
}
