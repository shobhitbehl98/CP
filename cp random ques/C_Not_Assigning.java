/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class C_Not_Assigning {

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
     public static class Pair {
            int val;
            int wt;
        
            Pair(int val, int wt) {
              this.val = val;
              this.wt = wt;
            }
        
          }
     public static class Graph{
            public ArrayList<Pair>[] adj;
            public Graph(int v){
                adj=new ArrayList[v];
                for(int i=0;i<v;i++){
                    adj[i]=new ArrayList<>();
                }
            }
    
            void addEdge(int s,int e,int w){
                  Pair st=new Pair(e,w);
                  adj[s].add(st);
                  Pair en=new Pair(s,w);
                  adj[e].add(en);
            }
        }      
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
            int n=f.nextInt();
            Graph g=new Graph(n);
            while(n-->0){
                int v=f.nextInt();
                int u=f.nextInt();
                g.addEdge(v, u, -1); 
                g.addEdge(u, v, -1); 
            }
            boolean min=false;
            for(int i=0;i<g.adj.length;i++){
               if(g.adj[i].size()>2){
                   min=true;
                   sb.append(-1+"\n");
                   break;
               }

            } 
            if(min){
                continue;
            }
            // dfs(g.adj,1);
         }
         System.out.println(sb);
    }

    public void dfs(LinkedList<>adj,int st){
      
    }
    }


    

