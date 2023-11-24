package day35;
//https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
public class Problem2091 {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int minInd=-1;
        int maxInd=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==min){
                minInd=i;
            }
            if(nums[i]==max){
                maxInd=i;
            }
        }
        int x = minInd;
        if(minInd > maxInd){
            minInd = maxInd;
            maxInd= x;
        }
        int op1 = maxInd+1;
        int op2 = (minInd+1) + (nums.length-maxInd);
        int op3 = nums.length-minInd;
        int ans = Math.min(op1,Math.min(op2,op3));
        return ans;

    }
}
