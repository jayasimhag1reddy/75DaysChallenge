package day18;

import java.util.Arrays;

//https://leetcode.com/problems/minimize-the-maximum-difference-of-pairs/
public class Problem2616 {
    public int minimizeMax(int[] nums, int p) {
        if(p==0 || nums.length==1)return 0;
        Arrays.sort(nums);
        int min=0;
        int max=nums[nums.length-1]-nums[0];
        while(min<max){
            int mid=min+(max-min)/2;

            if(helper(nums,mid)>=p){
                max=mid;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }
    public int helper(int[] nums,int mid){
        int c=0;
        int i=0;
        while(i<nums.length-1){
            if(nums[i+1]-nums[i]<=mid){
                c++;
                i++;
            }
            i++;
        }
        return c;
    }
}
