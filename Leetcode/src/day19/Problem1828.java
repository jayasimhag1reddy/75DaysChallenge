package day19;
//https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
public class Problem1828 {
    public int[] countPoints(int[][] points, int[][] q) {
        int[] ans=new int[q.length];
        for(int i=0;i<q.length;i++){
            ans[i]=helper(q[i],points);
        }
        return ans;
    }
    public int helper(int[] q,int[][] points){
        int ans=0;
        for(int[] ar:points){
            int x=ar[0]-q[0];
            int y=ar[1]-q[1];
            if((x*x)+(y*y)<=q[2]*q[2]){
                ans++;
            }
        }
        return ans;
    }
}
