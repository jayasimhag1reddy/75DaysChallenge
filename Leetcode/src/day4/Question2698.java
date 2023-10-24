package day4;
//https://leetcode.com/problems/find-the-punishment-number-of-an-integer/
public class Question2698 {
    public int punishmentNumber(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            int sq=i*i;
            if(isPunish(sq,i)){
                ans+=sq;
            }
        }
        return ans;
    }
    public boolean isPunish(int sq,int i){
        if(i<0 || sq<i){
            return false;
        }
        if(i==sq)return true;
        return isPunish(sq/10,i-sq%10) || isPunish(sq/100,i-sq%100) || isPunish(sq/1000,i-sq%1000);
    }
}

