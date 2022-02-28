/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class C_Division_by_Two_and_Permutation {

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
            int[] fr=new int[n+1];
            int[] arr=new int[n];
              Arrays.fill(fr, -1);          
             for(int i=0;i<n;i++){
                arr[i]=f.nextInt();
                if(arr[i]<=n&&fr[arr[i]]==-1){
                    fr[arr[i]]=i;
                }
            }
           
            for(int i=0;i<arr.length;i++){
                while(arr[i]>n){
                    arr[i]/=2;
                }
                while(arr[i]>0&&fr[arr[i]]!=-1){
                    arr[i]/=2;
                }
                if(arr[i]>0){
                    fr[arr[i]]=i;
                }
            }

            boolean x=true;
            for(int i=1;i<fr.length;i++){
                if(fr[i]==-1){
                    x=false;
                    break;
                }
            }
            if(x){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
                 
         }
         System.out.println(sb);
    }
    }


    

