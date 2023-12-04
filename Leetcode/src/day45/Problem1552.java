package day45;

import java.util.Arrays;

//https://leetcode.com/problems/magnetic-force-between-two-balls/
public class Problem1552 {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo = 0;
        int hi = position[position.length-1];
        int optimal = 0;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (canPlace(position, m, mid)) {
                optimal = mid;
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return optimal;
    }
    public boolean canPlace(int[] pos,int m,int mi){
        int c=1;
        int prev=pos[0];
        for(int i=1;i<pos.length;i++){
            if(pos[i]-prev>=mi){
                c++;
                prev=pos[i];
            }
        }
        return c>=m;
    }
}
