/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
class CodeChef{
// public class Building_Towers {

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
           int x=f.nextInt();
           long m=f.nextLong();
           int z=fn(x);
           if(z<=m){
               System.out.println(m-z+1);
           }else{
               System.out.println(0);
           }

                 
         }
    }

    public static int fn(int a) {
       int max=0;
       for(int i=0;i<32;i++){
           if((1<<i)==a){
               return i+1;
           }
           if(((1<<i)&a)==(1<<i)){
               if(a==i){
                   max=i;
               }else{
                   max=i+1;
               }
           }
       }
       return max+1; 
    }
    }


    

