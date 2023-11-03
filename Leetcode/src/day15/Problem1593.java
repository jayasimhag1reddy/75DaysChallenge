package day15;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/
public class Problem1593 {
    int max = 0;
    public int maxUniqueSplit(String s) {
        int n = s.length();
        backtrack(s, 0, new HashSet<String>());
        return max;
    }
    public void backtrack(String s, int start, Set<String> h) {
        if(start == s.length()) {
            max = Math.max(max, h.size());
        }
        String res = "";

        for(int i = start;i < s.length();i++) {
            res += s.charAt(i);
            if(h.contains(res)) continue;
            h.add(res);
            backtrack(s, i+1, h);
            h.remove(res);
        }
    }
}
