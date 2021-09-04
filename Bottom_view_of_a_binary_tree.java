import java.io.*;
import java.util.*;
public class Bottom_view_of_a_binary_tree {

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

    public static class Pair{
        Node node;
        int idx;
        
        Pair(Node node,int idx){
            this.node=node;
            this.idx=idx;
        }
    }    

    public static void bv(Node root){
        List<List<Integer>> li=new ArrayList<>();
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        LinkedList<Pair> qu=new LinkedList<>();
        int min=0,max=0;
        qu.addLast(new Pair(root, 0));
        while(qu.size()>0){
            Pair rem=qu.removeFirst();
            hm.putIfAbsent(rem.idx, new ArrayList<>());
            min=Math.min(min, rem.idx);
            max=Math.max(max, rem.idx);
            hm.get(rem.idx).add(rem.node.val);
            if(rem.node.left!=null){
                qu.addLast(new Pair(rem.node.left,rem.idx-1));
            }
            if(rem.node.right!=null){
                qu.addLast(new Pair(rem.node.right,rem.idx+1));
            }
        }

        for(int i=min;i<=max;i++){
           li.add(hm.get(i));
        }
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i).get(li.get(i).size()-1)+" ");
        }
     }
    
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         int[] arr=new int[t];
         for(int i=0;i<t;i++){
           arr[i]=f.nextInt();
         }
         int[] p=new int[1];
         Node root=con(arr,p);
         bv(root);
    }
    }


    

