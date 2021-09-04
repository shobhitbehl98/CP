import java.io.*;
import java.util.*;
public class Mother_Vertex {

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
    
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int v=f.nextInt();
         int e=f.nextInt();
         ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
         for(int i=0;i<v;i++){
             graph.add(new ArrayList<>());
         }

         for(int i=0;i<e;i++){
             int a=f.nextInt()-1;
             int b=f.nextInt()-1;
             graph.get(a).add(b);
         }
         LinkedList<Integer> st=new LinkedList<>();
         boolean[] vis=new boolean[v];
         for(int i=0;i<v;i++){
             if(vis[i]==false){
           dfs(i,graph,vis,st);
             }
         }

         int pa=st.removeFirst();
         boolean[] vis2=new boolean[v];
         int m=dfs2(pa,graph,vis2);
         if(m==v){
             sb.append(pa+1);
         }else{
             sb.append(-1);
         }

         System.out.println(sb);         
    }
    public static int dfs2(int src,ArrayList<ArrayList<Integer>> graph,boolean[] vis){
        vis[src]=true;
        int ret=0;
        for(int i=0;i<graph.get(src).size();i++){
            int y=graph.get(src).get(i);
            if(vis[y]==false){
                ret=dfs2(y,graph,vis);
            }
        }
        return ret+1;

    }
    public static void dfs(int src,ArrayList<ArrayList<Integer>> graph,boolean[] vis,LinkedList<Integer> st){
        vis[src]=true;
        for(int i=0;i<graph.get(src).size();i++){
            int y=graph.get(src).get(i);
            if(vis[y]==false){
                dfs(y,graph,vis,st);
            }
        }
        st.addFirst(src);

    }
    }


    

