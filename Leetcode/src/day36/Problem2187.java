package day36;
//https://leetcode.com/problems/minimum-time-to-complete-trips/
public class Problem2187 {
    public long minimumTime(int[] time, int totalTrips) {
        long s=1;
        long e=100_000_000_000_000L;
        long ans=-1;
        while(s<=e){
            long m=s+(e-s)/2;
            if(getTrips(time,m)>=totalTrips){
                ans=m;
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return ans;
    }
    public long getTrips(int[] nums,long m){
        long ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=(m/nums[i]);
        }
        return ans;
    }
}
