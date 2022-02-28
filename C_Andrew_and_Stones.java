/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class C_Andrew_and_Stones {

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
            int o=0;
            int e=0;  
            int ans=0;
            int sum=0;
            for(int i=1;i<n-1;i++){
               if(arr[i]%2==1){
                   o++;
                   sum+=arr[i];
               }else if(arr[i]%2==0&&arr[i]>=2){
                   e++;
                   ans+=arr[i]/2;
               }
            }
            if(e==0){
                sb.append(-1+"\n");
            }else{
                ans+=((sum+o)/2);
                sb.append(ans+"\n");
            }


                 
         }
         System.out.println(sb);
    }
    }


    

