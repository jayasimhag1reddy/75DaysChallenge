package day4;
//https://leetcode.com/problems/max-chunks-to-make-sorted/
public class Question769 {
    public int maxChunksToSorted(int[] arr) {
        int[] max=new int[arr.length];
        max[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            max[i]=Math.max(max[i-1],arr[i]);
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(max[i]==i)ans++;
        }
        return ans;
    }
}
