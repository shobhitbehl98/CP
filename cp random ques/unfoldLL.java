import java.util.*;

class unfoldLL {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    static ListNode x;
    static ListNode z;
    static boolean y=false;
    static boolean w=false;
    public static void unfold(ListNode head) {
       ListNode g=head.next;
       ListNode k=new ListNode(0);
       k.next=head;
       System.out.println();
       reccall(g,k,head);
       pall(head);
       System.out.println();
       
    }

    public static void pall(ListNode head){
        if(head==null)return;
        System.out.print(head.val+" ");
        pall(head.next);
    }
    
    public static void precall(ListNode c){
        if(c==null){
            y=true;
            return;
        }
        if(c.next!=null){
         c.next=c.next.next;
        }
        // System.out.print(c.val+" ");
        precall(c.next);
        if(y){
        x=c;
        // System.out.print("~"+x.val);
        y=false;
        }
        
    }
    
    public static void reccall(ListNode temp,ListNode e,ListNode head){
        if(temp==null){
            w=true;
            return;
        }
        // System.out.println(e.val+" %%% "+temp.val);
        if(temp.next!=null){
            reccall(temp.next.next,e.next.next,head);
            }else{
                w=true;
            }
        if(w){
            precall(head);
            System.out.println();
            x.next=temp;
            // System.out.println(x.val+" "+x.next.val);
            w=false;
        }
        if(e.next!=head){
        // System.out.println(temp.val+" ~~ "+e.val);
        temp.next=e;
        // System.out.println(temp.val+" "+temp.next.val);
       }else{
            // System.out.println(temp.val+" "+temp.next.val);
            temp.next=null;
            e.next=null;
        }
        
    }

    static int q=0;


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        q=n;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        unfold(head);
        scn.close();
    }
}