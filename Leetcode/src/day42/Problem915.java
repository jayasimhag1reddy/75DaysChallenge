package day42;
//https://leetcode.com/problems/partition-array-into-disjoint-intervals/submissions/
public class Problem915 {
    public int partitionDisjoint(int[] nums) {
        int[] right=new int[nums.length];
        int m=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            m=Math.min(m,nums[i]);
            right[i]=m;
        }
        m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            m=Math.max(nums[i],m);
            if(m<=right[i+1]){
                return i+1;
            }
        }
        return -1;
    }
}
