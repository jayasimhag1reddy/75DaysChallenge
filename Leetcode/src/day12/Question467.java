package day12;
//https://leetcode.com/problems/unique-substrings-in-wraparound-string/
public class Question467 {
    public int findSubstringInWraproundString(String s) {
        int[] count=new int[26];
        int c=1;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i>0 && (s.charAt(i)-s.charAt(i-1)==1 || s.charAt(i-1)-s.charAt(i)==25)){
                c++;
            }
            else{
                c=1;
            }
            count[s.charAt(i)-'a']=Math.max(count[s.charAt(i)-'a'],c);
        }
        for(int i=0;i<26;i++){
            ans+=count[i];
        }
        return ans;
    }
}
