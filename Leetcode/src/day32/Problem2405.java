package day32;
//https://leetcode.com/problems/optimal-partition-of-string/
public class Problem2405 {
    public int partitionString(String s) {
        //HashSet<Character> hs=new HashSet<>();
        boolean[] hs=new boolean[26];
        int ans=1;
        for(int i=0;i<s.length();i++){
            if(hs[s.charAt(i)-'a']==true){
                ans++;
                hs=new boolean[26];
            }
            hs[s.charAt(i)-'a']=true;
        }
        return ans;
    }
}
