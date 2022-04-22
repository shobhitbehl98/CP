/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class Book_Shop {

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
         int b = f.nextInt();
         int p = f.nextInt();
         int[] prices=new int[b+1];
         int[] pages=new int[b+1];
         for(int i=1;i<prices.length;i++){
             prices[i]=f.nextInt();
         }
         for(int i=1;i<pages.length;i++){
             pages[i]=f.nextInt();
         }

         int[][] dp=new int[prices.length][p+1];
         for(int i=1;i<dp.length;i++){
             for(int j=1;j<dp[0].length;j++){
                 dp[i][j]=dp[i-1][j];
                 if(j-prices[i]>=0){
                     dp[i][j]=Math.max(dp[i][j],pages[i]+dp[i-1][j-prices[i]]);
                 }
             }
         }


         System.out.println(dp[dp.length-1][dp[0].length-1]);


         
    }
    }


    

