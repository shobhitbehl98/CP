import java.io.*;
import java.util.*;
public class knapsack_m {

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
         int[] w=new int[t];
         int[] p=new int[t];
         for(int i=0;i<w.length;i++){
             w[i]=f.nextInt();
         }
         for(int i=0;i<p.length;i++){
             p[i]=f.nextInt();
         }
         int tar=f.nextInt();
         int[][] dp=new int[t+1][tar+1];
        int ans = rec(t,w,p,dp,tar);
        System.out.println(ans);
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    static int e=1;
    public static int rec(int n,int[] w,int[] p,int[][] dp,int tar){
        if(tar==0||n==0){
            dp[n][tar]=0;
            return 0;
        }
        
        if(dp[n][tar]!=0){
            return dp[n][tar];
        }
        
        if(w[n-1]<=tar){
            int a=Math.max(rec(n-1,w,p,dp,tar),p[n-1]+rec(n-1,w,p,dp,tar-w[n-1]));
            dp[n][tar]=a;
            System.out.println(e+" "+n+" "+tar+" "+a);
            e++;
            return a;
        }
        dp[n][tar]=rec(n-1,w,p,dp,tar);
        System.out.println(e+" "+n+" "+tar+" "+dp[n][tar]);
        e++;
        return dp[n][tar];
    }
    }


    

