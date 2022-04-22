import java.io.*;
import java.util.*;
public class Diagonal_anticlock_binary_tree {

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
    
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         int[] arr=new int[t];
         for(int i=0;i<t;i++){
             arr[i]=f.nextInt();
         }

         int[] ab=new int[1];
         Node root=con(arr, ab);
         List<List<Integer>> ans=new ArrayList<>();
         LinkedList<Node> qu=new LinkedList<>();
         qu.addLast(root);
         while(qu.size()>0){
            LinkedList<Node> ch=new LinkedList<>();
            List<Integer> li=new ArrayList<>();
            while(qu.size()>0){
            Node re=qu.removeFirst();
            ch.addLast(re);
           }
           while(ch.size()>0){
                Node xxx=ch.removeFirst();
                li.add(xxx.val);
                if(xxx.right!=null){
                    qu.addLast(xxx.right);
                }
                if(xxx.left!=null){
                    ch.addFirst(xxx.left);
                }
           }
           ans.add(li);
        }


        for(int i=0;i<ans.size();i++){
            sb.append(i+" -> ");
            for(int j=0;j<ans.get(i).size();j++){
             sb.append(ans.get(i).get(j)+" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
    }


    

