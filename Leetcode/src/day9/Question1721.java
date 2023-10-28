package day9;
//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
public class Question1721 {
    public ListNode swapNodes(ListNode head, int k) {
        int n=getLen(head);
        int[] arr=new int[n];
        int i=0;
        while(head!=null){
            arr[i++]=head.val;
            head=head.next;
        }
        swap(arr,k-1,n-k);
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        for(int j=0;j<n;j++){
            dummy.next=new ListNode(arr[j]);
            dummy=dummy.next;
        }
        return ans.next;
    }
    public int getLen(ListNode t){
        int ans=0;
        while(t!=null){
            ans++;
            t=t.next;
        }
        return ans;
    }
    public void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
}
