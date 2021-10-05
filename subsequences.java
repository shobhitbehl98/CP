/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class subsequences {

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
         String s=f.nextLine();
         sub(s,"");
    }

    public static void sub(String s,String ans){
         if(s.length()==0){
             System.out.println(ans);
             return;
         }
         char ch=s.charAt(0);
         String roq=s.substring(1);
         sub(roq,ans+ch);
         sub(roq,ans);
         
    }
    }


    

