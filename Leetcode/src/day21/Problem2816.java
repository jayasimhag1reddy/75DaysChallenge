package day21;
//https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
public class Problem2816 {
    public ListNode doubleIt(ListNode head) {
        ListNode rev=reverse(head);
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        int c=0;
        while(rev!=null){
            c+=rev.val*2;
            dummy.next=new ListNode(c%10);
            c/=10;
            rev=rev.next;
            dummy=dummy.next;
        }
        if(c>0){
            dummy.next=new ListNode(c);
        }
        return reverse(ans.next);
    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        while(head!=null){
            ListNode ne=head.next;
            head.next=pre;
            pre=head;
            head=ne;
        }
        return pre;
    }
}
class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }