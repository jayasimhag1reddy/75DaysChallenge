package day35;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-length-of-pair-chain/
public class Problem646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a, b)->(a[1]-b[1]));
        int c=0;
        int end=Integer.MIN_VALUE;
        for(int[] p:pairs){
            if(p[0]>end){
                c++;
                end=p[1];
            }
        }
        return c;
    }
}
