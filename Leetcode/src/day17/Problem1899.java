package day17;
//https://leetcode.com/problems/merge-triplets-to-form-target-triplet/
public class Problem1899 {
    public boolean mergeTriplets(int[][] trip, int[] tar) {
        int a=0,b=0,c=0;
        for(int[] ar:trip){
            if(ar[0]<=tar[0] && ar[1]<=tar[1] && ar[2]<=tar[2]){
                a=Math.max(a,ar[0]);
                b=Math.max(b,ar[1]);
                c=Math.max(c,ar[2]);
            }
            if(tar[0]==a && tar[1]==b && tar[2]==c){
                return true;
            }
        }
        return false;
    }
}
