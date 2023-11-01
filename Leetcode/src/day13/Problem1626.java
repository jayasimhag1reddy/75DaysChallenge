package day13;

import java.util.Arrays;

//https://leetcode.com/problems/best-team-with-no-conflicts/
public class Problem1626 {
    public int bestTeamScore(int[] score, int[] age) {
        Node[] arr=new Node[age.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=new Node(age[i],score[i]);
        }
        Arrays.sort(arr,(a, b)->a.age==b.age?a.score-b.score:a.age-b.age);
        int[] dp=new int[arr.length];
        dp[0]=arr[0].score;
        int max=dp[0];
        for(int i=1;i<arr.length;i++){
            dp[i]=arr[i].score;
            for(int j=0;j<i;j++){
                if(arr[j].score<=arr[i].score){
                    dp[i]=Math.max(dp[i],arr[i].score+dp[j]);
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;

    }
}
class Node{
    int age;
    int score;
    public Node(int age,int score){
        this.age=age;
        this.score=score;
    }
}

