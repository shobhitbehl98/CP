/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class A_AB_Balance {

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
           String s=f.nextLine();
           char[] arr=s.toCharArray();
           int i=0,j=arr.length-1;
           if(arr[i]!=arr[j]){
               arr[i]=arr[j];
           }

           for(int k=0;k<arr.length;k++){
               sb.append(arr[k]);
           }

           sb.append("\n");
         }
         System.out.println(sb);
    }
    }


    

