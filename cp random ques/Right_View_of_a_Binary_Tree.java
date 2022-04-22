import java.io.*;
import java.util.*;
public class Right_View_of_a_Binary_Tree {

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
     public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val,Node left,Node right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public static Node con(int[] inp,int[] pos){
        if(pos[0]>inp.length||inp[pos[0]]==-1){
             pos[0]++;
             return null;
            }
            Node temp=new Node(inp[pos[0]++],null,null);
            temp.left=con(inp,pos);
            temp.right=con(inp,pos);
            
            return temp;
        }
        
        public static void display(Node root){
            if(root==null){
                return;
            }
    
            StringBuilder a=new StringBuilder();
            if(root.left!=null){
                a.append(root.left.val);
            }else{
                a.append(".");
            }
            a.append(" -> ");
            a.append(root.val);
            a.append(" <- ");
            if(root.right!=null){
                a.append(root.right.val);
            }else{
                a.append(".");
            }
            System.out.println(a);
            display(root.left);
            display(root.right);
        }

        public static void lv(Node root){
            Queue<Node> qu=new LinkedList<>();
            Queue<Node> ch=new LinkedList<>();
            qu.add(root);
            while(qu.size()>0||ch.size()>0){
                if(qu.size()==0){
                    Queue<Node> temp=new LinkedList<>();
                    temp=ch;
                    ch=qu;
                    qu=temp;
                }
                Node g=qu.poll();
                if(qu.size()==0){
                    System.out.println(g.val);
                }
                if(g.left!=null){
                ch.add(g.left);
                }
                if(g.right!=null){
                ch.add(g.right);
                }

            }
        }
    public static void main(String[] args){
         FastReader f=new FastReader();
        //  StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         int[] input=new int[t];
         int i=0;
         while(t-->0){
           input[i]=f.nextInt();
           i++;
         }
         int[] pos=new int[1];
         Node root=con(input,pos);
        //  System.out.println(root);
         lv(root);
        //  display(root);
    }
    }


    

