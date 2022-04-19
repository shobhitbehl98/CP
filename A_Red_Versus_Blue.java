/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class A_Red_Versus_Blue {

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
            int r=f.nextInt();
            int b=f.nextInt();
            while(r>0&&b>0){
                int k=(int)Math.ceil(((r*1.0)/(b+1)));
                for(int i=0;i<k;i++){
                    sb.append('R');
                    r--;
                }
                sb.append('B');
                b--;
            }
            while(r>0){
                sb.append('R');
                r--;
            }
            sb.append("\n");
                 
         }
         System.out.println(sb);
    }
    }


    

