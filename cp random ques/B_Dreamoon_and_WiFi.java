/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class B_Dreamoon_and_WiFi {

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
         char[] s1=f.nextLine().toCharArray();
         char[] s2=f.nextLine().toCharArray();
         int a=0;
         l=0;
         double p=1;
         for(char x:s2){
             if(x=='?'){
                 p*=2;
             }
         }
         rec(a,s1,s2,0,0);
         double ans=(l/p);
         System.out.println(ans);
    }
    static double l;
    public static void rec(int a,char[] s1,char[] s2,int d,int i) {
        if(i==s1.length){
           if(d==a){
               l++;
           }
           return;
        }
        if(s1[i]=='+'){
            a++;
        }else{
            a--;
        }
        if(s2[i]=='?'){
            rec(a,s1,s2,d+1,i+1);
            rec(a,s1,s2,d-1,i+1);
        }else{
            if(s2[i]=='+'){
                d++;
            }else{
                d--;
            }
            rec(a,s1,s2,d,i+1);
        }


    }
    }


    

