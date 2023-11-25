package day36;
//https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/
public class Problem1185 {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int ans=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                i++;
            }
            else{
                ans=Math.max(ans,j-i);
                j++;
            }
        }
        return ans;
    }
}
