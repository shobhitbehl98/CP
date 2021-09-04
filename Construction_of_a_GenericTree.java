import java.io.*;
import java.util.*;
public class Construction_of_a_GenericTree {

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

    private static class Node{
        int data;
        ArrayList<Node> al=new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.al) {
          str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);
    
        for (Node child : node.al) {
          display(child);
        }
      }

    public static Node construct(int[] arr){
         Node root=null;
         Stack<Node> st=new Stack<>();
         for(int i=0;i<arr.length;i++){
             if(arr[i]==-1){
                 st.pop();
             }else{
                 Node e=new Node();
                 e.data=arr[i];
                 if(st.size()>0){
                     st.peek().al.add(e);
                 }else{
                     root=e;
                 }
                 st.push(e);
             }
         }

        return root;
    }
    public static void main(String[] args){
         FastReader f=new FastReader();
         int n=f.nextInt();
         int[] arr=new int[n];
         String[] s=f.nextLine().split(" ");
         for(int i=0;i<n;i++){
           arr[i]=Integer.parseInt(s[i]);
         }
         Node root=construct(arr); 
         display(root);
    }
    }

