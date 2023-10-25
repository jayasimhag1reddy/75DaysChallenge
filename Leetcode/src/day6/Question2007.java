package day6;

import java.util.*;

//https://leetcode.com/problems/find-original-array-from-doubled-array/
public class Question2007 {
    public int[] findOriginalArray(int[] ch) {
        Arrays.sort(ch);
        int[] ans = new int[ch.length / 2];
        int k = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i : ch) {
            if (!q.isEmpty() && q.peek() == i) {
                ans[k++] = q.poll() / 2;
            } else {
                q.add(i * 2);
            }
        }
        return ans;
    }
}
