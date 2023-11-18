package day29;

import java.util.Arrays;

//https://leetcode.com/problems/boats-to-save-people/
public class Problem881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int ans=0;
        while(i<j){
            if(people[i]+people[j]<=limit){
                ans++;
                i++;
                j--;
            }
            else{
                ans++;
                j--;
            }
        }
        if(i==j){
            ans++;
        }
        return ans;
    }
}
