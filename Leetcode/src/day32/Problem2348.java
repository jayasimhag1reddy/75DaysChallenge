package day32;
//https://leetcode.com/problems/number-of-zero-filled-subarrays/
public class Problem2348 {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
            else{
                ans+=((c)*(c+1))/2;
                c=0;
            }
        }
        ans+=(((c)*(c+1))/2);
        return ans;
    }
}
