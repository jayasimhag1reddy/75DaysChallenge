package day9;
//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
public class Question2130 {
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=slow;
        ListNode re=rev(slow);
        int ans=0;
        while(head!=fast){
            ans=Math.max(ans,head.val+re.val);
            head=head.next;
            re=re.next;
        }
        return ans;

    }
    public ListNode rev(ListNode head){
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
