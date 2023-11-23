package day34;

import java.util.*;

//https://leetcode.com/problems/arithmetic-subarrays/
public class Problem1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> al=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int[] arr=new int[r[i]-l[i]+1];
            int k=0;
            for(int j=l[i];j<=r[i];j++){
                arr[k++]=nums[j];
            }
            al.add(isArth(arr));
        }
        return al;
    }
    public boolean isArth(int[] nums){
        Arrays.sort(nums);
        int d=nums[1]-nums[0];
        for(int i=2;i<nums.length;i++){
            if(nums[i]-nums[i-1]!=d){
                return false;
            }
        }
        return true;
    }
}
