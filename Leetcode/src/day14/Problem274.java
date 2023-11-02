package day14;

import java.util.Arrays;

//https://leetcode.com/problems/h-index/
public class Problem274 {
    public int hIndex(int[] ci) {
        Arrays.sort(ci);
        int ans=0;
        for(int i=0;i<ci.length;i++){
            if(ci[i]>=ci.length-i){
                ans=Math.max(ans,ci.length-i);
            }
        }
        return ans;
    }
}
