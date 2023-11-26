package day37;
//https://leetcode.com/problems/removing-stars-from-a-string/
public class Problem2390 {
    public String removeStars(String s) {
        //Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(i<s.length()){
            if(s.charAt(i)=='*'){
                sb.deleteCharAt(j-1);
                j--;
            }
            else{
                sb.append(s.charAt(i));
                j++;
            }
            i++;
        }
        return sb.toString();
    }
}
