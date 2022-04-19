/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
class CodeChef{
// public class The_Army {

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
            int m=f.nextInt();
            int[] ans=new int[n];
            int[] val=new int[m];
            int kmin=m;
            int kmax=0;
            for(int i=0;i<m;i++){
               val[i]=f.nextInt(); 
               kmin=Math.min(kmin,val[i]);   
               kmax=Math.max(kmax,val[i]);   
            }
            for(int i=0;i<n;i++){
                int max=0;
                max=Math.max(max,Math.max(Math.abs(i-kmin),Math.abs(i-kmax)));
                sb.append(max+" ");
            }

            sb.append("\n");
                 
         }
         System.out.println(sb);
    }
    }


    

