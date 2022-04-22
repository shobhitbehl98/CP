import java.io.*;
import java.util.*;

public class Print_target_sum_sbset {

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
            String psf;
        
            Pair(int i, int j,String psf) {
              this.i = i;
              this.j = j;
              this.psf=psf;
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
         int k=f.nextInt();
         boolean[][] dp=new boolean[t+1][k+1];
         dp[0][0]=true;
         for(int i=1;i<t+1;i++){
             for(int j=0;j<k+1;j++){
                 if(j==0){
                     dp[i][j]=true;
                 }
                 if(dp[i-1][j]||(arr[i-1]<=j&&dp[i-1][j-arr[i-1]])){
                       dp[i][j]=true;
                 }       
             }
          }
         sb.append(dp[dp.length-1][dp[0].length-1]+"\n");

          LinkedList<Pair> qu=new LinkedList<>();
          qu.addLast(new Pair(dp.length-1,dp[0].length-1,""));

          while(qu.size()>0){
            Pair r=qu.removeFirst();
            if(r.j==0){
                sb.append(r.psf+"\n");
                continue;
            }
            if(r.j>=arr[r.i-1]&&dp[r.i-1][r.j-arr[r.i-1]]){
                qu.addLast(new Pair(r.i-1,r.j-arr[r.i-1],r.i-1+" "+r.psf));
            }
            if(dp[r.i-1][r.j]){
                qu.addLast(new Pair(r.i-1,r.j,r.psf));
            }

          }

          System.out.println(sb);


         
    }
    }


    

