/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
class CodeChef{
// public class Subarray_Mex {

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
            int x=f.nextInt();
            
            
            if(x>k){
                sb.append(-1+"\n");
            }else{
                int[] arr=new int[n];
                for(int i=0;i<x;i++){
                   arr[i]=i;
                }
                int j=0;
                for(int i=x;i<arr.length;i++){
                    arr[i]=arr[j];
                    j++;
                }

                for(int val:arr){
                    sb.append(val+" ");
                }
                sb.append("\n");
            }

         }
         System.out.println(sb);
    }
    }


    

