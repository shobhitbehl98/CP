/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class C_Tic_tac_toe {

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;k
 
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
         String w=f.nextLine();
         String s=f.nextLine();
         String t=f.nextLine();
         char[] a=w.toCharArray();
         char[] b=s.toCharArray();
         char[] c=t.toCharArray();
         char[][] arr=new char[3][3];
            for(int j=0;j<arr[0].length;j++){
                  arr[0][j]=a[j];      
            }
            for(int j=0;j<arr[0].length;j++){
                  arr[1][j]=b[j];      
            }
            for(int j=0;j<arr[0].length;j++){
                  arr[2][j]=c[j];      
            }
           

    }
    }


    

