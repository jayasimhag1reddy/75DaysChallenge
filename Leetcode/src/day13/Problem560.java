package day13;

import java.util.HashMap;

//https://leetcode.com/problems/subarray-sum-equals-k/
public class Problem560 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        int sum=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
                ans+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
