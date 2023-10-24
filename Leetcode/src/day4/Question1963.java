package day4;

//https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
public class Question1963 {
    public int minSwaps(String s) {
        int op=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                op++;
            }
            else{
                if(op>0){
                    op--;
                }
            }
        }
        return (op+1)/2;
    }
}
