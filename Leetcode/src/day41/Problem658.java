package day41;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-k-closest-elements/
public class Problem658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i=0;
        int j=arr.length-1;
        while((j-i)>=k){
            if(Math.abs(arr[i]-x)>Math.abs(arr[j]-x)){
                i++;
            }
            else{
                j--;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int l=i;l<=j;l++){
            ans.add(arr[l]);
        }
        return ans;
    }
}
