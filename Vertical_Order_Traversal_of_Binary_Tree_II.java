import java.io.*;
import java.util.*;
public class Vertical_Order_Traversal_of_Binary_Tree_II {

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

    public static class Pair implements Comparable<Pair>{
        Node temp;
        int idx;

        Pair(Node temp,int idx){
            this.temp=temp;
            this.idx=idx;
        }

        public int compareTo(Pair o){
           return this.temp.val-o.temp.val;
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
        
        public static void width(Node root,int hl,int[] arr){
            if(root==null)return;

            arr[0]=Math.min(arr[0],hl);
            arr[1]=Math.max(arr[1],hl);
            width(root.left,hl-1,arr);
            width(root.right,hl+1,arr);
        }

        public static ArrayList<ArrayList<Integer>> vot(Node root){
            ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
            PriorityQueue<Pair> pa=new PriorityQueue<>();
            PriorityQueue<Pair> ch=new PriorityQueue<>();
            int[] minmax=new int[2];
            width(root,0,minmax);
            int len=minmax[1]-minmax[0]+1;
            for(int i=0;i<len;i++){
                ans.add(new ArrayList<>());
            }
            pa.add(new Pair(root,0-minmax[0]));
            while(pa.size()>0||ch.size()>0){
                if(pa.size()==0){
                    PriorityQueue<Pair> temp=new PriorityQueue<>();
                    temp=pa;
                    pa=ch;
                    ch=temp;
                }
                Pair rem=pa.remove();
                ans.get(rem.idx).add(rem.temp.val);
                
                if(rem.temp.left!=null){
                    ch.add(new Pair(rem.temp.left,rem.idx-1));
                }
                if(rem.temp.right!=null){
                    ch.add(new Pair(rem.temp.right,rem.idx+1));
                }
                

        }
        return ans;
    }
    
    public static void main(String[] args){
         FastReader f=new FastReader();
        //  StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         int[] arr=new int[t];
         for(int i=0;i<t;i++){
             arr[i]=f.nextInt();
         }
         int[] pos=new int[1];
         Node root=con(arr,pos);
         ArrayList<ArrayList<Integer>> ans=vot(root);
         for(int i=0;i<ans.size();i++){
             System.out.print(i+" -> ");
           for(int j=0;j<ans.get(i).size();j++){
               System.out.print(ans.get(i).get(j)+" ");
           }
           System.out.println();  
         }
    }
    }


    

