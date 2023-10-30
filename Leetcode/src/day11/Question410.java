package day11;
//https://leetcode.com/problems/split-array-largest-sum/
public class Question410 {
    public int splitArray(int[] nums, int k) {
        int max=0;
        int sum=0;
        for(int i:nums){
            max=Math.max(max,i);
            sum+=i;
        }
        while(max<=sum){
            int mid=max+(sum-max)/2;
            if(possible(nums,mid,k)){
                sum=mid-1;
            }
            else{
                max=mid+1;
            }
        }
        return max;
    }
    public boolean possible(int[] nums,int mid,int k){
        int ans=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                ans++;
                sum=nums[i];
            }
        }
        return ans<=k;
    }
}
