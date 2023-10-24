package day3;
//https://leetcode.com/problems/minimum-sum-of-mountain-triplets-ii/
public class Question2909 {
    public int minimumSum(int[] nums) {
        int[] fro=new int[nums.length];
        int[] back=new int[nums.length];
        int min=nums[0];
        fro[0]=min;
        for(int i=1;i<nums.length;i++){
            fro[i]=min;
            min=Math.min(min,nums[i]);
        }
        min=nums[nums.length-1];
        back[nums.length-1]=min;
        for(int i=nums.length-2;i>=0;i--){
            back[i]=min;
            min=Math.min(min,nums[i]);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>fro[i] && nums[i]>back[i]){
                ans=Math.min(ans,nums[i]+fro[i]+back[i]);
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}
