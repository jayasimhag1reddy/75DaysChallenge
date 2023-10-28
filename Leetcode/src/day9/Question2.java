package day9;
//https://leetcode.com/problems/add-two-numbers/
public class Question2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        int c=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+c;
            c=sum/10;
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+c;
            c=sum/10;
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            l1=l1.next;
        }
        while(l2!=null){
            int sum=l2.val+c;
            c=sum/10;
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            l2=l2.next;
        }
        if(c!=0){
            dummy.next=new ListNode(c);
        }
        return ans.next;
    }
}
class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
