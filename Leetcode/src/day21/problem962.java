package day21;
//https://leetcode.com/problems/maximum-width-ramp/
public class problem962 {
    public int maxWidthRamp(int[] nums) {
        int[] min=new int[nums.length];
        int[] max=new int[nums.length];
        min[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            min[i]=Math.min(min[i-1],nums[i]);
        }
        max[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            max[i]=Math.max(max[i+1],nums[i]);
        }
        int i=0;
        int j=0;
        int ans=0;
        while(i<nums.length && j<nums.length){
            if(min[i]<=max[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
