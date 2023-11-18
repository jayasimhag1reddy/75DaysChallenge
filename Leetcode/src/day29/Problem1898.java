package day29;
//https://leetcode.com/problems/maximum-number-of-removable-characters/
public class Problem1898 {
    public int maximumRemovals(String s, String p, int[] rem) {
        char[] st=s.toCharArray();
        int l=0;
        int r=rem.length;
        while(l<=r){
            int m=l+(r-l)/2;
            if(isSub(st,s,p,rem,m)){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return r;
    }
    public boolean isSub(char[] st,String s,String p,int[] rem,int m){
        for(int i=0;i<m;i++){
            st[rem[i]]='#';
        }
        int j=0;
        for(int i=0;i<s.length();i++){
            if(j<p.length() && st[i]==p.charAt(j)){
                j++;
            }
        }
        for(int i=0;i<m;i++){
            st[rem[i]]=s.charAt(rem[i]);
        }
        return j==p.length();
    }
}
