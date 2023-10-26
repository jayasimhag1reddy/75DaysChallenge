package day7;

import java.util.*;

//https://leetcode.com/problems/queue-reconstruction-by-height/
public class Question406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        List<int[]> ans=new LinkedList<>();
        for(int[] ar:people){
            ans.add(ar[1],ar);
        }
        int[][] res=new int[people.length][2];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}
