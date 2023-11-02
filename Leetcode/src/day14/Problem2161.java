package day14;
//https://leetcode.com/problems/partition-array-according-to-given-pivot/
public class Problem2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] ans=new int[n];
        int i=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]<pivot){
                ans[i++]=nums[k];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==pivot){
                ans[i++]=nums[j];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>pivot){
                ans[i++]=nums[j];
            }
        }
        return ans;
    }
}
