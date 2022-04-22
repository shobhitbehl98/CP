import java.io.*;
import java.util.*;
public class vertical_order_sum {

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

    public static void width(Node root,int v){
        max=Math.max(v,max);
        min=Math.min(v,min);
        if(root.left!=null){
        width(root.left,v-1);
        }
        if(root.right!=null){
        width(root.right,v+1);
        }
    }
    static int max=0;        
    static int min=0;      
     public static class Pair {
            Node temp;
            int n;
        
            Pair(Node temp, int n) {
              this.temp = temp;
              this.n = n;
            }
        
          }  
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int n=f.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=f.nextInt();
         }
         int[] pos=new int[1];
         Node root=con(arr, pos);
         width(root,0);
         int[] al = new int[max-min+1];
         LinkedList<Pair> qu=new LinkedList<>();
         qu.addLast(new Pair(root,0-min));
         while(qu.size()>0){
            Pair r=qu.removeFirst();
            al[r.n]+=r.temp.val;
            if(r.temp.left!=null){
                qu.addLast(new Pair(r.temp.left,r.n-1));
            }
            if(r.temp.right!=null){
                qu.addLast(new Pair(r.temp.right,r.n+1));
            }
         }

         for(int i=0;i<al.length;i++){
             System.out.println(al[i]);
         }

         
    }
    }


    

