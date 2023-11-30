package day42;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/restore-ip-addresses/
public class Problem93 {
    public List<String> restoreIpAddresses(String s) {
        if(s.length()>12)return new ArrayList<>();
        List<String> ans=new ArrayList<>();
        for(int i=0;i<s.length()-2;i++){
            for(int j=i+1;j<i+4 && j<s.length()-1 ;j++){
                for(int k=j+1;k<j+4 && k<s.length() ;k++){
                    String s1=s.substring(0,i);
                    String s2=s.substring(i,j);
                    String s3=s.substring(j,k);
                    String s4=s.substring(k,s.length());
                    if(isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)){
                        ans.add(s1+"."+s2+"."+s3+"."+s4);
                    }
                }
            }
        }
        return ans;
    }
    public boolean isValid(String s){
        if(s.length()>3 || s.length()==0 || Integer.valueOf(s)>255 || (s.charAt(0)=='0' && s.length()>1)){
            return false;
        }
        return true;
    }
}
