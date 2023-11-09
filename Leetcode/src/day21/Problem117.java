package day21;

import java.util.*;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
public class Problem117 {
    public Node connect(Node root) {
        if(root==null)return root;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int si=q.size();
            while(si>0){
                Node temp=q.poll();
                if(si>1){
                    temp.next=q.peek();
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                si--;
            }
        }
        return root;
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};