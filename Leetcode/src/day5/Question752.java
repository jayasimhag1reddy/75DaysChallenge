package day5;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/open-the-lock/
public class Question752 {
    public int openLock(String[] deadends, String target) {
        Queue<String> q=new LinkedList<>();
        HashSet<String> hs=new HashSet<>();
        for(String s:deadends)hs.add(s);
        if(hs.contains(target) || hs.contains("0000"))return -1;
        if(target.equals("0000"))return 0;
        q.add("0000");
        hs.add("0000");
        int ans=0;
        while(!q.isEmpty()){
            int si=q.size();
            ans++;
            while(si>0){
                String s=q.poll();
                for(int i=0;i<4;i++){
                    char c=s.charAt(i);
                    String up = s.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + s.substring(i + 1);
                    String dwn = s.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + s.substring(i + 1);
                    if(up.equals(target) || dwn.equals(target)){
                        return ans;
                    }
                    if(!hs.contains(up)){
                        q.add(up);
                        hs.add(up);
                    }
                    if(!hs.contains(dwn)){
                        q.add(dwn);
                        hs.add(dwn);
                    }
                }
                si--;
            }
        }
        return -1;
    }
}
