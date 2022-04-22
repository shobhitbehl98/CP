/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class subseq {

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
         rec(s,"");
    }
    public static void rec(String q,String ans){
        if(q.length()==0){
            System.out.println(ans);
            return;
        }
       char ch=q.charAt(0);
       String roq=q.substring(1);
       int n=ch-'a';
       boolean[] map=new boolean[26];
       if(!map[n]){
           map[n]=true;
            rec(roq,ans);
       }
       
    }
    }


    

