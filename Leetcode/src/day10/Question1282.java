package day10;

import java.util.*;

//https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
public class Question1282 {
    public List<List<Integer>> groupThePeople(int[] gs) {
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<gs.length;i++){
            if(!hm.containsKey(gs[i])){
                hm.put(gs[i],new ArrayList<>());
            }
            hm.get(gs[i]).add(i);
        }
        List<List<Integer>> al=new ArrayList<>();
        for(int i:hm.keySet()){
            if(hm.get(i).size()==i){
                al.add(hm.get(i));
            }
            else{
                for(int j=0;j<hm.get(i).size();j+=i){
                    List<Integer> temp=new ArrayList<>();
                    for(int k=j;k<j+i;k++){
                        temp.add(hm.get(i).get(k));
                    }
                    al.add(temp);
                }
            }
        }
        return al;
    }
}
