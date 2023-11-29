package day41;
//https://leetcode.com/problems/get-equal-substrings-within-budget/submissions/
public class Problem1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] dif=new int[s.length()];
        for(int i=0;i<s.length();i++){
            dif[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        int i=0;
        int ans=0;
        int cost=0;
        for(int j=0;j<s.length();j++){
            cost+=dif[j];
            while(cost>maxCost){
                cost-=dif[i];
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}
