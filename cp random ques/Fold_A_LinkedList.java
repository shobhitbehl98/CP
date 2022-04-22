import java.util.*;

class Fold_A_LinkedList {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static ListNode reverse(ListNode node){
        if(node==null||node.next==null){
            return node;
        }
        
        ListNode prev=null;
        ListNode curr=node;
        ListNode fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        
        return prev;
    }
    
    public static ListNode mid(ListNode node){
        if(node==null||node.next==null){
            return node;
        }
        
        ListNode slow=node;
        ListNode fast=node;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void fold(ListNode head) {
      if(head==null||head.next==null){
            return;
        }
        
        ListNode mid=mid(head);
        ListNode k=mid.next;
        mid.next=null;
        ListNode nh=reverse(k);
        
        
        ListNode c1=head;
        ListNode c2=nh;
        ListNode f1=null;
        ListNode f2=null;
        
        while(c2!=null){
            f1=c1.next;
            f2=c2.next;
            c1.next=c2;
            c2.next=f1;
            c1=f1;
            c2=f2;
        }
        
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        fold(head);
        printList(head);
    }
}