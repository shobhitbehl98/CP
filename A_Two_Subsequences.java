/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class A_Two_Subsequences {

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
            int min=0;
            for(int i=1;i<s.length();i++){
                if(s.charAt(min)>s.charAt(i)){
                    min=i;
                }
            }
            String b=s.substring(0,min)+s.substring(min+1);
            sb.append(s.charAt(min)+" "+b+"\n");
         }
         System.out.println(sb);
    }
    }


    

