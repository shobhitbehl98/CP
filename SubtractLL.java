import java.util.*;

class SubtractLL {
  public static Scanner scn = new Scanner(System.in);

  public static class ListNode {
    int val = 0;
    ListNode next = null;

    ListNode(int val) {
      this.val = val;
    }
  }

  public static ListNode subtractTwoNumbers(ListNode l1, ListNode l2) {
     ListNode a=l1;
       ListNode b=l2;
        int an=0;
       while(a!=null){
           an++;
           a=a.next;
       }
        int bn=0;
       while(b!=null){
           bn++;
           b=b.next;
       }
        a=l1;
        b=l2;
        boolean neg=false;
        int h=Math.abs(an-bn);
       if(an<bn){
           while(h-->0){
               ListNode n=new ListNode(0);
               n.next=a;
               a=n;
           }
           neg=true;
       }else if(bn<an){
           while(h-->0){
               ListNode n=new ListNode(0);
               n.next=b;
               b=n;
           }
       }
        Pair d=rec(a,b);
         if(neg){
            d=rec(b,a);
            d.x.val*=-1;
            return d.x;
        }
        
        return d.x;
  }
    public static class Pair{
        ListNode x;
        int c;
        Pair(ListNode x,int c){
            this.x=x;
            this.c=c;
        }
    }
    public static Pair rec(ListNode a,ListNode b){
        if(a==null&&b==null){
            return new Pair(null,0);
        }
        Pair res=rec(a.next,b.next);
        int f=a.val-res.c-b.val;
        int c=0;
        if(f<0){
            f+=10;
            c=1;
        }
        ListNode m=new ListNode(f);
        m.next=res.x;
        return new Pair(m,c);
    }

  // InFput_code===================================================

  public static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.val + " ");
      node = node.next;
    }
  }

  public static ListNode makeList(int n) {
    ListNode dummy = new ListNode(-1);
    ListNode prev = dummy;
    while (n-- > 0) {
      prev.next = new ListNode(scn.nextInt());
      prev = prev.next;
    }

    return dummy.next;
  }

  public static void main(String[] args) {
    ListNode head1 = makeList(scn.nextInt());
    ListNode head2 = makeList(scn.nextInt());

    ListNode ans = subtractTwoNumbers(head1, head2);
    printList(ans);
  }

}