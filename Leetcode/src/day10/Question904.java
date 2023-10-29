package day10;
//https://leetcode.com/problems/fruit-into-baskets/submissions/
public class Question904 {
    public int totalFruit(int[] fruits) {
        if(fruits.length<3)return fruits.length;
        //int b1=0;
        int box1=fruits[0];
        int j=1;
        while(j<fruits.length && fruits[j]==fruits[j-1]){
            j++;
        }
        if(j==fruits.length)return j;
        //int b2=j;
        int box2=fruits[j];
        int c=j+1;
        int ans=c;
        for(int i=j+1;i<fruits.length;i++){
            if(fruits[i]==box1){
                c++;
            }
            else if(fruits[i]==box2){
                c++;
            }
            else{
                if(fruits[i-1]==box1){
                    box2=fruits[i];
                    int k=i-1;
                    while(fruits[k]==fruits[k-1]){
                        k--;
                    }
                    c=i-k+1;
                    //b2=i;
                    //c=i-b1+1;
                }
                else{
                    box1=fruits[i];
                    int k=i-1;
                    while(fruits[k]==fruits[k-1]){
                        k--;
                    }
                    c=i-k+1;
                    // b1=i;
                    // c=i-b2+1;
                }
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}
