package day13;

import java.util.HashMap;

//https://leetcode.com/problems/contiguous-array/
public class Problem525 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=0;
        int ans=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            c+=nums[i]==1?1:-1;
            if(hm.containsKey(c)){
                ans=Math.max(ans,i-hm.get(c));
            }else{
                hm.put(c,i);
            }
        }
        return ans;
    }
}
