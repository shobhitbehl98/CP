import java.util.*;

class ReverseLL {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    static ListNode h;
    static ListNode t;
    public static void fn(ListNode r){
        r.next=null;
        if(h==null&&t==null){
            h=r;
            t=r;
        }else{
           r.next=h;
           h=r;
        }
    }
    public static ListNode reverse(ListNode head) {
        ListNode g=head;
        h=null;
        t=null;
       while(g!=null){
           ListNode c=g;
           g=g.next;
           fn(c);
       }
       return h;
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

        ListNode head = reverse(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        scn.close();
    }
}