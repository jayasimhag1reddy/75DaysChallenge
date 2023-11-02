package day14;
//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
public class Problem1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        int s=1;
        int e=-1;
        for(int i:nums){
            e=Math.max(i,e);
        }
        while(s<e){
            int m=s+(e-s)/2;
            if(getSum(nums,m)>threshold){
                s=m+1;
            }
            else{
                e=m;
            }

        }
        return s;
    }
    public int getSum(int[] arr,int n){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%n==0){
                ans+=(arr[i]/n);
            }
            else{
                ans+=(arr[i]/n)+1;
            }
        }
        return ans;
    }
}
