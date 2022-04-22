/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class B_Not_Sitting {

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
            int m=f.nextInt();

            int[][] arr=new int[n][m];
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                      int a=Math.max(arr.length-1-i,i-0);      
                      int b=Math.max(arr[0].length-1-j,j-0);
                      pq.add(a+b);      
                }
             }

             while(pq.size()>0){
                sb.append(pq.remove()+" ");
             }
             sb.append("\n");
                 
         }
         System.out.println(sb);
    }
    }


    

