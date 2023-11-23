package day34;

import java.util.Arrays;

//https://leetcode.com/problems/largest-number/
public class Problem179 {
    public String largestNumber(int[] nums) {
        String[] arr=new String[nums.length];
        //Arrays.sort(arr,((a+b).compareTo(b+a));
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a, b)->(b+a).compareTo(a+b));
        if(arr[0].charAt(0)=='0'){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
        return sb.toString();
    }
}
