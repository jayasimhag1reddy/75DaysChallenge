package day2;

import java.util.*;
//https://leetcode.com/problems/most-common-word/

public class Question819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String par = paragraph.toLowerCase();
        List<String> arr = new ArrayList<>();
        String st = "";
        for (int i = 0; i < par.length(); i++) {
            if (Character.isLetter(par.charAt(i))) {
                st += par.charAt(i);
            } else {
                if (st.length() != 0) {
                    arr.add(st);
                    st = "";
                }
            }
        }
        if (st.length() != 0) {
            arr.add(st);
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : arr) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        String ans = "";
        List<String> al = new ArrayList<>();
        for (String ban : banned) {
            al.add(ban);
        }
        int fre = Integer.MIN_VALUE;
        for (String str : hm.keySet()) {
            System.out.println(hm.get(str) + "" + str);
            if (!al.contains(str) && hm.get(str) > fre) {
                ans = str;
                fre = hm.get(str);
            }
        }
        return ans;
    }
}
