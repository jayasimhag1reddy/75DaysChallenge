package day43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/sort-vowels-in-a-string/submissions/
public class Problem2785 {
    public String sortVowels(String s) {
        List<Character> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A' || c=='E' || c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'|| c=='o' || c=='u'){
                al.add(c);
            }
        }
        if(al.size()==0)return s;
        Collections.sort(al);
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A' || c=='E' || c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'|| c=='o' || c=='u'){
                sb.append(al.get(j));
                j++;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
