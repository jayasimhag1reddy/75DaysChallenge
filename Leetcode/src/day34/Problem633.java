package day34;
//https://leetcode.com/problems/sum-of-square-numbers/
public class Problem633 {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(long) Math.sqrt(c);
        while(i<=j){
            long res=(i*i)+(j*j);
            if(res==c){
                return true;
            }
            else if(res>c){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
