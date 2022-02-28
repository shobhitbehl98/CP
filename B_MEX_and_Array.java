/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class B_MEX_and_Array {

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
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=f.nextInt();
            } 
            int ans=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    ans+=(j-i+1);
                    for(int k=i;k<=j;k++){
                        if(a[k]==0)ans++;
                    }
                }
            }
            sb.append(ans+"\n");
                 
         }
         System.out.println(sb);
    }
    }


    

