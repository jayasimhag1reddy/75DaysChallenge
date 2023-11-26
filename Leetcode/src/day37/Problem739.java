package day37;

import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/
public class Problem739 {
    public int[] dailyTemperatures(int[] t) {
        Stack<int[]> st=new Stack<>();
        int[] ans=new int[t.length];
        int j=t.length-1;
        for(int i=j;i>=0;i--){
            int c=1;
            while(!st.isEmpty() && st.peek()[0]<=t[i]){
                c+=st.pop()[1];
            }
            if(st.isEmpty()){
                st.push(new int[]{t[i],0});
                ans[j--]=0;
            }
            else{
                st.push(new int[]{t[i],c});
                ans[j--]=c;
            }
        }
        return ans;
    }
}
