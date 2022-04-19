/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class A_Cut_Ribbon {

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
         int n=f.nextInt();
         int a=f.nextInt();
         int b=f.nextInt();
         int c=f.nextInt();
         int[] arr={a,b,c};
         Arrays.sort(arr);
         int[] dp=new int[n+1];
         Arrays.fill(dp, -1);
         dp[0]=0;
         for(int i=1;i<dp.length;i++){
             for(int val:arr){
                 if(i-val>=0&&dp[i-val]!=-1){
                   dp[i]=Math.max(dp[i-val]+1,dp[i]);
                 }
             }
         }
         System.out.println(dp[n]);

    }
    
    }


    

