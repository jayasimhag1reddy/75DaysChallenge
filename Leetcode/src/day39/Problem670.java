package day39;
//https://leetcode.com/problems/maximum-swap/
public class Problem670 {
    public int maximumSwap(int num) {
        if(num<10)return num;
        char[] ch=String.valueOf(num).toCharArray();
        int[] ind=new int[10];
        for(int i=0;i<ch.length;i++){
            ind[ch[i]-'0']=i;
        }
        for(int i=0;i<ch.length;i++){
            for(int j=9;j>ch[i]-'0';j--){
                if(ind[j]>i){
                    swap(ch,i,ind[j]);
                    return Integer.valueOf(String.valueOf(ch));
                }
            }
        }
        return num;
    }
    public void swap(char[] ch,int i,int j){
        char tem=ch[i];
        ch[i]=ch[j];
        ch[j]=tem;
    }
}
