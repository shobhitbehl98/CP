/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class A_Sorting_Parts {

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
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=f.nextInt();
            }
            int[] j=new int[n];
            for(int i=0;i<n;i++){
                j[i]=arr[i];
            }
            Arrays.sort(j);
            boolean m=true;
            for(int i=0;i<j.length;i++){
                if(arr[i]!=j[i]){
                    m=false;
                }
            }
            if(m){
                sb.append("NO\n");
            }else{
                sb.append("YES\n");
            }



                 
         }
         System.out.println(sb);
    }
    }


    

