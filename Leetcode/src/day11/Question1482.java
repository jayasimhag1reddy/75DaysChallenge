package day11;
//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
public class Question1482 {
    public int minDays(int[] bd, int m, int k) {
        if((long)((long)m*(long)k)>bd.length)return -1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:bd){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        while(min<max){
            int mid=min+(max-min)/2;
            if(possibleBq(bd,k,mid)<m){
                min=mid+1;
            }
            else{
                max=mid;
            }
        }
        return min;
    }
    public int possibleBq(int[] nums,int k,int m){
        int ans=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=m){
                c++;
            }
            else{
                ans+=c/k;
                c=0;
            }
        }
        if(c>0){
            ans+=c/k;
        }
        return ans;
    }
}
