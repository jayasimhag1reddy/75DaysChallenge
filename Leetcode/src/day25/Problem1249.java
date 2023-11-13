package day25;

import java.util.Stack;

//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
public class Problem1249 {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==')' && c>=0){
                c++;
                st.add(s.charAt(i));
            }
            else if(s.charAt(i)=='(' && c!=0){
                c--;
                st.add(s.charAt(i));
            }
            else if(Character.isLetter(s.charAt(i))){
                st.add(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            char ch=st.pop();
            if(c>0 && ch==')'){
                c--;
            }
            else if(c<0 && ch=='('){
                c++;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
