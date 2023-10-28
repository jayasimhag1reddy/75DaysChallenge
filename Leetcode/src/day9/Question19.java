package day9;
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class Question19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)return null;
        int len=length(head);
        int k=len-n;
        if(n==len){head=head.next;
            return head;
        }
        ListNode temp=head;
        while(k>1){
            head=head.next;
            k--;
        }
        if(n==1)head.next=null;
        else if(head.next.next!=null)head.next=head.next.next;
        return temp;

    }
    public int length(ListNode temp){
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
}
