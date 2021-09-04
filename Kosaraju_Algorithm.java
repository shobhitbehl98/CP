import java.io.*;
import java.util.*;
public class Kosaraju_Algorithm {

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
         int v=f.nextInt();
         int e=f.nextInt();
         ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
         for(int i=0;i<v;i++){
             graph.add(new ArrayList<>());
            }
            for(int i=0;i<e;i++){
                int u=f.nextInt()-1;
                int c=f.nextInt()-1;
                graph.get(u).add(c);
            }
            boolean[] vis=new boolean[v];
            LinkedList<Integer> stack=new LinkedList<>();
            for(int i=0;i<v;i++){
                if(vis[i]==false){
                    dfs1(i,graph,vis,stack);
                }
            }
            
            ArrayList<ArrayList<Integer>> graph2=new ArrayList<>();
            for(int i=0;i<v;i++){
                graph2.add(new ArrayList<>());
               }
            for(int i=0;i<v;i++){
                for(int j=0;j<graph.get(i).size();j++){
                    int g=graph.get(i).get(j);
                    graph2.get(g).add(i);
                }
            }
            
        boolean[] vis2=new boolean[v];
        int ans=0;
        while(stack.size()>0){
            int r=stack.removeFirst();
            if(vis2[r]==false){
             dfs2(r,graph2,vis2);
             ans++;
            }
        }
        System.out.println(ans);

    }

    public static void dfs2(int src,ArrayList<ArrayList<Integer>> graph,boolean[] vis2){
           vis2[src]=true;
           for(int i=0;i<graph.get(src).size();i++){
               int f=graph.get(src).get(i);
               if(vis2[f]==false){
                   dfs2(f,graph,vis2);
               }
           }
    }
    
    public static void dfs1(int src,ArrayList<ArrayList<Integer>> graph,boolean[] vis,LinkedList<Integer> stack){
        vis[src]=true;
        for(int i=0;i<graph.get(src).size();i++){
            int w=graph.get(src).get(i);
            if(vis[w]==false){
                dfs1(w,graph,vis,stack);
            }
        }
        stack.addFirst(src);
    }
    }

