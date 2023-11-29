package day40;
//https://leetcode.com/problems/find-the-winner-of-an-array-game/
public class Problem1535 {
    public int getWinner(int[] arr, int k) {
        int ans=arr[0];
        int wins=0;
        for(int i=1;i<arr.length;i++){
            if(ans>arr[i]){
                wins++;
            }
            else{
                wins=1;
                ans=arr[i];
            }
            if(wins==k)break;
        }
        return ans;
    }
}
