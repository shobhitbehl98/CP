import java.io.*;
import java.util.*;
public class Vertical_Order_Traversal_of_Binary_Tree {

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

    public static class Pair{
        Node temp;
        int idx;

        Pair(Node temp,int idx){
            this.temp=temp;
            this.idx=idx;
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

        public static List<List<Integer>> vot(Node root){
            List<List<Integer>> ans=new ArrayList<>();
            LinkedList<Pair> qu=new LinkedList<>();
            HashMap<Integer,List<Integer>> hm=new HashMap<>();
            qu.addLast(new Pair(root,0));
            int max=0;
            int min=0;
            while(qu.size()>0){
                int s=qu.size();
                while(s-->0){
                Pair re=qu.poll();
                max=Math.max(max,re.idx);
                min=Math.min(min,re.idx);
                hm.putIfAbsent(re.idx,new ArrayList<>());
                hm.get(re.idx).add(re.temp.val);
                if(re.temp.left!=null){
                qu.addLast(new Pair(re.temp.left,re.idx-1));
                }
                if(re.temp.right!=null){
                qu.addLast(new Pair(re.temp.right,re.idx+1));
                }
            }
        }
       for(int i = min;i<=max;i++){
          ans.add(hm.get(i));
       }
        return ans;
    }
    
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         int[] arr=new int[t];
         for(int i=0;i<t;i++){
             arr[i]=f.nextInt();
         }
         int[] pos=new int[1];
         Node root=con(arr,pos);
         List<List<Integer>> ans=vot(root);
         System.out.println(ans);
    }
    }


    

