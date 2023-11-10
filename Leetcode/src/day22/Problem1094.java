package day22;
//https://leetcode.com/problems/car-pooling/
public class Problem1094 {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] car=new int[1001];
        for(int[] trip:trips){
            car[trip[1]]+=trip[0];
            car[trip[2]]-=trip[0];
        }
        int pas=0;
        for(int i=0;i<1001;i++){
            pas+=car[i];
            if(pas>capacity)return false;
        }
        return true;
    }
}
