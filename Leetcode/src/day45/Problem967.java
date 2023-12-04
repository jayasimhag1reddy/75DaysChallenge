package day45;

import java.util.*;

//https://leetcode.com/problems/numbers-with-same-consecutive-differences/
public class Problem967 {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> al = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            helper(n, k, i, i, al, 1);
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }

    public void helper(int n, int k, int num, int pre, List<Integer> al, int len) {
        if (len > n) {
            return;
        }
        if (len == n) {
            al.add(num);
            return;
        }
        if (pre + k < 10) {
            helper(n, k, (num * 10) + pre + k, pre + k, al, len + 1);
        }
        if (k != 0 && pre >= k) {
            helper(n, k, (num * 10) + pre - k, pre - k, al, len + 1);
        }
    }
}
