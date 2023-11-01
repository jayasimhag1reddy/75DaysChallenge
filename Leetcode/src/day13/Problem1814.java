package day13;

import java.util.HashMap;

//https://leetcode.com/problems/count-nice-pairs-in-an-array/
public class Problem1814 {
    public int countNicePairs(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]-rev(nums[i]);
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=(ans+hm.getOrDefault(arr[i],0))%1000000007;
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            //System.out.println(hm);
        }
        return ans;
    }
    public int rev(int n){
        int num=0;
        while(n>0){
            int rem=n%10;
            num=(num*10)+rem;
            n/=10;
        }
        return num;
    }
}
