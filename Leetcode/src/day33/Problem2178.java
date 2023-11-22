package day33;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/maximum-split-of-positive-even-integers/
public class Problem2178 {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ans=new ArrayList<>();
        if(finalSum%2!=0)return ans;
        long i=2;
        long rem=finalSum;
        while(i<=rem){
            ans.add(i);
            rem-=i;
            i+=2;
        }
        long last=ans.remove(ans.size()-1);
        ans.add(last+rem);
        return ans;
    }
}
