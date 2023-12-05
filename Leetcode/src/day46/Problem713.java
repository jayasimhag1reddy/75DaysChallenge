package day46;
//https://leetcode.com/problems/subarray-product-less-than-k/
public class Problem713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
        int prod=1;
        int j=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            while(prod>=k){
                prod/=nums[j];
                j++;
            }
            ans+=i-j+1;
        }
        return ans;
    }
}
