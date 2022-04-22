import java.io.*;
import java.util.*;
public class C_Book {

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
        
         int t = f.nextInt();
         while(t-->0){
            int v=f.nextInt();
            ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
            for(int i=0;i<v;i++){
               graph.add(new ArrayList<>());
            }
            for(int i=1;i<=v;i++){
              String[] p=f.nextLine().split(" ");
              for(int k=1;k<p.length;k++){
                  int o=Integer.parseInt(p[k]);
                  System.out.println(o+" "+i);
                  graph.get(o).add(i);
              }
            }

            Stack<Integer> st=new Stack<>();
            boolean[] visited=new boolean[v];
            for(int i=0;i<v;i++){
                if(!visited[i]){
                dfs(i,visited,st,graph);
                }
            }

            while(st.size()>0){
                System.out.println(st.pop());
            }
                 
         }
    }
    public static void dfs(int i,boolean[] visited,Stack<Integer> st,ArrayList<ArrayList<Integer>> graph){
         visited[i]=true;

         for(int j=0;j<graph.get(i).size();j++){
            if(!visited[j]){
                dfs(graph.get(i).get(j),visited,st,graph);
            }
         }
         st.push(i);
    }
    }


    

