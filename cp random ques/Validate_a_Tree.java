import java.io.*;
import java.util.*;
public class Validate_a_Tree {

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
    public static Node con(int[] inp,int pos[]){
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
        static Node prev=new Node(0,null,null);

    public static boolean validate(Node root){
        if(root==null){
            return true;
        }
        boolean left=validate(root.left);
        if(left==false){
            return left;
        }
        if(prev!=null&&prev.val>root.val){
            return false;
        }
        prev=root;
        boolean right=validate(root.right);
        if(right==false){
            return right;
        }

        return true;
    }


    
    public static void main(String[] args){
         FastReader f=new FastReader();
        //  StringBuilder sb=new StringBuilder();
         int n = f.nextInt();
         int[] inp=new int[n];
         for(int i=0;i<n;i++){
             inp[i]=f.nextInt();
         }
         int[] pos=new int[1];
         Node root=con(inp,pos);
        //  boolean ans=validate(root);
        //  System.out.print(ans);
         display(root);

    }
    }


    

