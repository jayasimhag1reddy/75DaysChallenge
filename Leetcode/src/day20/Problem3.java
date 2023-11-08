package day20;

import java.util.HashMap;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int ans=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                j=Math.max(j,hm.get(s.charAt(i))+1);
            }
            hm.put(s.charAt(i),i);
            ans=Math.max(ans,i-j+1);
        }

        return ans;
    }
}
