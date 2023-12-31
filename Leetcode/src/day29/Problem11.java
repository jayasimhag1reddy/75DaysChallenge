package day29;
//https://leetcode.com/problems/container-with-most-water/
public class Problem11 {
    public int maxArea(int[] height) {
        int ans=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            ans=Math.max(ans,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}
