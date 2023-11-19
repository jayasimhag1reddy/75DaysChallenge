package day31;
//https://leetcode.com/problems/swap-nodes-in-pairs/
public class Problem24 {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        ListNode pre=dummy;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            ListNode ne=temp.next;
            temp.next=ne.next;
            ne.next=temp;
            pre.next=ne;
            pre=temp;
            temp=temp.next;
        }
        return dummy.next;
    }
}
