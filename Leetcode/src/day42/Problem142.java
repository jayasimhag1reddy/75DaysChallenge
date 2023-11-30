package day42;
//https://leetcode.com/problems/linked-list-cycle-ii/
public class Problem142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        boolean flag=false;
        int len=1;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                flag=true;
                break;
            }
        }
        if(!flag){
            return null;
        }
        slow=slow.next;
        while(slow!=fast){
            slow=slow.next;
            len++;
        }
        ListNode frst=head;
        ListNode sec=head;
        while(len>0){
            sec=sec.next;
            len--;
        }
        while(frst!=sec){
            frst=frst.next;
            sec=sec.next;
        }
        return frst;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
