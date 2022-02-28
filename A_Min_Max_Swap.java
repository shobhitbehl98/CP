/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
// class CodeChef{
public class A_Min_Max_Swap {

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
            int n=f.nextInt();
            int[] arr=new int[2*n];
            int[] a=new int[n];
            int[] b=new int[n];
            int max=-1;
            for(int i=0;i<n;i++){
                a[i]=f.nextInt();
                if(a[i]>max)
            }
            for(int i=0;i<n;i++){
               b[i]=f.nextInt();
            }

            
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
                 
         }
    }
    }


    

