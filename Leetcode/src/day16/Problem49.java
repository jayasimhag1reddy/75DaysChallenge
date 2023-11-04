package day16;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/
public class Problem49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String st=String.valueOf(ch);
            if(!hm.containsKey(st)){
                hm.put(st,new ArrayList<>());
            }
            hm.get(st).add(s);
        }
        List<List<String>> ans=new ArrayList<>();
        for(String a:hm.keySet()){
            ans.add(hm.get(a));
        }
        return ans;
    }
}
