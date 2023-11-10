package day22;

import java.util.PriorityQueue;

//https://leetcode.com/problems/merge-k-sorted-lists/
public class Problem23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a, b)->a.val-b.val);
        for(ListNode ar:lists){
            while(ar!=null){
                pq.add(new ListNode(ar.val));
                ar=ar.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode ans=dummy;
        while(!pq.isEmpty()){
            ans.next=pq.poll();
            ans=ans.next;
        }
        return dummy.next;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }