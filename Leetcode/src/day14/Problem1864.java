package day14;
//https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-binary-string-alternating/
public class Problem1864 {
    public int minSwaps(String s) {
        int n=s.length();
        int c1=0;
        int c2=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                c++;
            }
            else{
                c--;
            }
            if(i%2==0){
                if(s.charAt(i)=='0'){
                    c1++;
                }
                else{
                    c2++;
                }
            }
            else{
                if(s.charAt(i)=='1'){
                    c1++;
                }
                else{
                    c2++;
                }
            }
        }
        if(c>1 || c<-1)return -1;
        if(c1%2==0 && c2%2==0){
            return Math.min(c1/2,c2/2);
        }
        if(c1%2==0){
            return c1/2;
        }
        if(c2%2==0){
            return c2/2;
        }
        return -1;
    }
}
