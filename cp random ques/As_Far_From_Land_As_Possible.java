import java.io.*;
import java.util.*;
public class As_Far_From_Land_As_Possible {

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
        int i;
        int j;
        int st;
    
        Pair(int i, int j,int st) {
          this.i = i;
          this.j = j;
          this.st = st;
        }
    
      }
    
    public static void main(String[] args){
         FastReader f=new FastReader();
         int n=f.nextInt();
         int[][] graph=new int[n][n];
         LinkedList<Pair> qu=new LinkedList<>();
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=f.nextInt();
                if(graph[i][j]==1){
                    qu.add(new Pair(i,j,0));
                }
            }
        }
        int max=0;
        while(qu.size()>0){
           Pair rem=qu.remove();
           max=Math.max(rem.st,max);
           if(rem.i-1>=0&&graph[rem.i-1][rem.j]==0){
               graph[rem.i-1][rem.j]=1;
               qu.add(new Pair(rem.i-1,rem.j,rem.st+1));
            }
            if(rem.i+1<graph.length&&graph[rem.i+1][rem.j]==0){
                graph[rem.i+1][rem.j]=1;
                qu.add(new Pair(rem.i+1,rem.j,rem.st+1));
            }
            if(rem.j-1>=0&&graph[rem.i][rem.j-1]==0){
                graph[rem.i][rem.j-1]=1;
                qu.add(new Pair(rem.i,rem.j-1,rem.st+1));
            }
            if(rem.j+1<graph[0].length&&graph[rem.i][rem.j+1]==0){
                graph[rem.i][rem.j+1]=1;
                qu.add(new Pair(rem.i,rem.j+1,rem.st+1));
                
           }
        }

        System.out.println(max);

        
    }

    
    }


    

