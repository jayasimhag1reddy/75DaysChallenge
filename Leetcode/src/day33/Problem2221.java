package day33;
//https://leetcode.com/problems/find-triangular-sum-of-an-array/
public class Problem2221 {
    public int triangularSum(int[] nums) {
        for(int i=nums.length;i>0;i--){
            for(int j=1;j<i;j++){
                nums[j-1]=(nums[j-1]+nums[j])%10;
            }
        }
        return nums[0];
    }
}
