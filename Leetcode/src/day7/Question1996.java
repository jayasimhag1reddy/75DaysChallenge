package day7;

import java.util.Arrays;

//https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/
public class Question1996 {
    public int numberOfWeakCharacters(int[][] prop) {
        Arrays.sort(prop,(a, b)->(a[0]==b[0]?a[1]-b[1]:b[0]-a[0]));
        int c=0;
        int max=0;
        for(int i=0;i<prop.length;i++){
            if(prop[i][1]<max){
                c++;
            }
            max=Math.max(max,prop[i][1]);
        }
        return c;
    }
}
