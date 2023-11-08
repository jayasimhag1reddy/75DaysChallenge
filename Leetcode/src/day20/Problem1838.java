package day20;

import java.util.Arrays;

//https://leetcode.com/problems/frequency-of-the-most-frequent-element/
public class Problem1838 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum=0;
        int j=0,i=0,ans=1;
        while(i<nums.length){
            sum+=nums[i];
            while(nums[i]*(i-j+1)>sum+k){
                sum-=nums[j];
                j++;
            }
            ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans;
    }
}
