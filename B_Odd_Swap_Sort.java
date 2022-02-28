/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class B_Odd_Swap_Sort {

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
            int n=f.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=f.nextLong();
            }
            boolean v=true;
            for(int i=0;i+1<n;i++){
               if(arr[i]>arr[i+1]){
                   long h=(arr[i]+arr[i+1]);
                   if(h%2==1){
                      long p=arr[i];
                      arr[i]=arr[i+1];
                      arr[i+1]=p;
                   }else{
                       v=false;
                       break;
                   }
               }
            }

            if(v){
                sb.append("Yes\n");
            }else{
                sb.append("No\n");
            }
                 
         }
         System.out.println(sb);
    }
    }


    

