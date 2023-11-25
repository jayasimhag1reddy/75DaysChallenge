package day36;

import java.util.Arrays;

//https://leetcode.com/problems/smallest-value-of-the-rearranged-number/
public class Problem2165 {
    public long smallestNumber(long num) {
        if(num==0)return 0;
        boolean neg=false;
        if(num<0){
            neg=true;
        }
        if(neg)num=0-num;
        String s=String.valueOf(num);
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        // System.out.println(Arrays.toString(ch));
        if(neg){
            StringBuilder ans=new StringBuilder();
            for(int i=ch.length-1;i>=0;i--){
                ans.append(ch[i]);
            }
            return 0-Long.valueOf(ans.toString());
        }
        int i=0;
        StringBuilder ans=new StringBuilder();
        while(ch[i]=='0'){
            i++;
        }
        ans.append(ch[i]);
        // System.out.println(i);
        for(int k=0;k<i;k++){
            ans.append('0');
        }
        for(int j=i+1;j<ch.length;j++){
            ans.append(ch[j]);
        }
        return Long.valueOf(ans.toString());
    }
}
