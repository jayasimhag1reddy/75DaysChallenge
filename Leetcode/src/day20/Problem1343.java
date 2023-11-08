package day20;
//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
public class Problem1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        long avg=0;
        long sum=0;
        int c=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        avg=sum/k;
        if(avg>=threshold){
            c++;
        }
        for(int i=k;i<arr.length;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            avg=sum/k;
            if(avg>=threshold){
                c++;
            }
        }
        return c;
    }
}
