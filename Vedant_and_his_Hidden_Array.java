/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
class CodeChef{
// public class Vedant_and_his_Hidden_Array {

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
            int k=f.nextInt();
            if(k%2==1){
                if(n%2==0){
                   sb.append("Even\n");
                }else{
                   sb.append("Odd\n");
                }
            }else{
                if(n==1){
                    sb.append("Even\n");
                }else{
                    sb.append("Impossible\n");
                }
            }
                 
         }
         System.out.println(sb);
    }
    }


    

