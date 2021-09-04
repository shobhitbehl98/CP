import java.io.*;
import java.util.*;
public class Pepcoding_Course_Schedule {

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
             int a=f.nextInt();
             int b=f.nextInt();
             graph.get(a).add(b);
         }

         boolean[] vis=new boolean[v];

         for(int i=0;i<v;i++){
             if(vis[i]==false){
                 dfs(i,graph,vis,e);
             }
         }
         if(rec>e){
             sb.append(-1);
         }else{
         for(int i=0;i<ans.size();i++){
             sb.append(ans.get(i)+" ");
         }
        }
         System.out.println(sb);


    }
    public static ArrayList<Integer> ans=new ArrayList<>();
    public static int rec=0;
    public static void dfs(int src,ArrayList<ArrayList<Integer>> graph,boolean[] vis,int edges){
        for(int i=0;i<graph.get(src).size();i++){
            int x=graph.get(src).get(i);
            if(vis[x]==false){
                if(rec<=edges){
                    rec++;
                dfs(x,graph,vis,edges);
                }else{
                    return;
                }
            }
        }
       vis[src]=true;
       ans.add(src);
    }
    }


    

