/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class coin_change {

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
         int t=f.nextInt();
         int[] arr=new int[t];
         for(int i=0;i<t;i++){
             arr[i]=f.nextInt();
         }
         int k=f.nextInt();

         int x=cc(arr,k,"",0);
         System.out.println(x);
    }

    public static int cc(int[] arr,int tar,String ans,int count){
       if(tar==0){
         System.out.println(ans);
         return count+1;
       }
       int a=0;
       for(int i=0;i<arr.length;i++){
           if(tar-arr[i]>=0){
               a+=cc(arr,tar-arr[i],ans+arr[i],count);
           }
       }
       return a;
    }
    public static int cc2(int[] arr,int tar,String ans,int count){
       if(tar==0){
         System.out.println(ans);
         return count+1;
       }
       int a=0;
       for(int i=0;i<arr.length;i++){
           if(tar-arr[i]>=0){
               a+=cc(arr,tar-arr[i],ans+arr[i],count);
           }
       }
       return a;
    }
    }


    

