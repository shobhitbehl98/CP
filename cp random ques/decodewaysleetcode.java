/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class decodewaysleetcode {

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
         String s=f.nextLine();
         dec(s);
         System.out.println(count);

    }
    public static int count=0;
    public static void dec(String s){
        if(s.length()==0){
            // System.out.println(ans);
            count++;
            return;
        }
         char ch=s.charAt(0);
         String roq1=s.substring(1);
         int x=ch-'0';
         if(x==0){
             return;
         }
         int letter1=x+64;
         dec(roq1);
         if(s.length()>=2){
         String two=s.substring(0,2);
         String roq2=s.substring(2);
         int h=Integer.parseInt(two);
         if(h>=10&&h<=26){
             h+=64;
             char letter2=(char)h;
            dec(roq2);
         }
        }
    }
    }


    

