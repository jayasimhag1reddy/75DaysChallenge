package day3;
//https://leetcode.com/problems/minimum-sum-of-mountain-triplets-i/
public class Question2908 {
    public int minimumSum(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]<nums[j] && nums[k]<nums[j]){
                        ans=Math.min(ans,nums[i]+ nums[j]+nums[k]);
                    }
                }
            }
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}
