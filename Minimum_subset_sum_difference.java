import java.io.*;
import java.util.*;
public class Minimum_subset_sum_difference {

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
         int l=f.nextInt();
         while(l-->0){
         int t = f.nextInt();
         int[] arr=new int[t];
         int sum=0;
         for(int i=0;i<arr.length;i++){
             arr[i]=f.nextInt();
             sum+=arr[i];
         }
         boolean[][] dp=new boolean[arr.length+1][(sum/2)+1];
         dp[0][0]=true;
         for(int i=1;i<dp.length;i++){
             for(int j=0;j<dp[0].length;j++){
                 if(j==0){
                   dp[i][j]=true;
                 }

                 if(j>=arr[i-1]){
                     if(dp[i-1][j]||dp[i-1][j-arr[i-1]]){
                         dp[i][j]=true;
                     }
                 }else{
                    dp[i][j]=dp[i-1][j];
                }
             }
         }
         int x=dp[0].length-1;
         for(int i=dp[0].length-1;i>=0;i--){
             if(dp[dp.length-1][i]){
                 x=i;
                 break;
             }
         }

         System.out.println(sum-(2*x));
        }
         
    }
    }


    

