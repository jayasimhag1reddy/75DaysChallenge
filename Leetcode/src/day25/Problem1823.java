package day25;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/find-the-winner-of-the-circular-game/
public class Problem1823 {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size()!=1){
            int c=k-1;
            while(c>0){
                q.add(q.poll());
                c--;
            }
            q.poll();
        }
        return q.poll();
    }
}
