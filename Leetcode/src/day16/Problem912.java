package day16;
//https://leetcode.com/problems/sort-an-array/
public class Problem912 {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] nums,int i,int j){
        if(i>=j){
            return;
        }
        int m=(i+(j-i)/2);
        mergeSort(nums,i,m);
        mergeSort(nums,m+1,j);
        merge(nums,i,m,j);
    }
    public void merge(int[] nums,int i,int m,int j){
        int n1=m+1-i;
        int n2=j-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int k=0;k<n1;k++){
            left[k]=nums[i+k];
        }
        for(int k=0;k<n2;k++){
            right[k]=nums[m+1+k];
        }
        int l=0;
        int k=0;
        int p=i;
        while(l<n1 && k<n2){
            if(left[l]<right[k]){
                nums[p]=left[l];
                l++;
            }
            else{
                nums[p]=right[k];
                k++;
            }
            p++;
        }
        while(l<n1){
            nums[p++]=left[l++];
        }
        while(k<n2){
            nums[p++]=right[k++];
        }
    }
}
