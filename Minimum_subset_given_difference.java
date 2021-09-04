import java.io.*;
import java.util.*;
public class Minimum_subset_given_difference {

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
         int diff=f.nextInt();
         int[][] dp=new int[arr.length+1][((sum+diff)/2)+1];
         dp[0][0]=1;
         for(int i=1;i<dp.length;i++){
             for(int j=0;j<dp[0].length;j++){
                 if(j==0){
                   dp[i][j]=1;
                 }

                 if(j>=arr[i-1]){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                 }else{
                    dp[i][j]=dp[i-1][j];
                }
             }
         }
         System.out.println(dp[dp.length-1][dp[0].length-1]);
        }
         
    }
    }


    

