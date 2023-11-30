package day42;

import java.util.HashSet;

//https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/
public class Problem1461 {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            if(!hs.contains(s.substring(i,i+k))){
                hs.add(s.substring(i,i+k));
            }
        }
        return hs.size() == 1<<k;
    }
}
