package day44;
//https://leetcode.com/problems/custom-sort-string/
public class Problem791 {
    public String customSortString(String order, String s) {
        int[] ar=new int[26];
        for(int i=0;i<s.length();i++){
            ar[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<order.length();i++){
            int a=order.charAt(i)-'a';
            if(ar[a]!=0){
                for(int j=0;j<ar[a];j++){
                    sb.append(order.charAt(i));
                }
                ar[a]=0;
            }
        }
        for(int i=0;i<26;i++){
            if(ar[i]!=0){
                for(int j=0;j<ar[i];j++){
                    sb.append((char)(i+'a'));
                }
            }
        }
        return sb.toString();
    }
}
