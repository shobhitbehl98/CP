/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class all_indices {

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
         String[] s=f.nextLine().split(" ");
         int k=f.nextInt();
         int[] arr=new int[t];
         for(int i=0;i<t;i++){
             arr[i]=Integer.parseInt(s[i]);
         }
         int[] finalans=allind(arr,0,0,k);

         for(int i=0;i<finalans.length;i++){
             System.out.print(finalans[i]+" ");
         }
    }

    public static int[] allind(int[] arr,int i,int size,int tar){
        if(i==arr.length){
            int[] base=new int[size];
            return base;
        }
        if(arr[i]==tar){
            size++;
        }

        int[] ans=allind(arr,i+1,size,tar);
        if(arr[i]==tar){
        ans[size-1]=i;
        }
        return ans;
    }
    }


    

