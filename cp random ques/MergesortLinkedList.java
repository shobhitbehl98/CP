import java.util.*;

class MergesortLinkedList {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode mid(ListNode head){
        if(head==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode mergeSort(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode nh=mid(head);
        ListNode newhead=nh.next;
        nh.next=null;
        ListNode left=mergeSort(head);
        ListNode right=mergeSort(newhead);
        return mergeTwo(left,right);
    }
    
    
    public static ListNode mergeTwo(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode p=dummy;
        
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                p.next=l1;
                l1=l1.next;
                p=p.next;
            }else{
                p.next=l2;
                l2=l2.next;
                p=p.next;
            }
        }
        
        if(l1!=null){
            p.next=l1;
        }else if(l2!=null){
            p.next=l2;
        }
        
        return dummy.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ListNode h1 = createList(n);

        ListNode head = mergeSort(h1);
        printList(head);
    }
}