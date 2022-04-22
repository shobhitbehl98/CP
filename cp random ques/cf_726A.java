import java.util.*;
import java.io.*;

public class cf_726A {
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
          FastReader scn=new FastReader();
          StringBuilder sb=new StringBuilder();
          int t=scn.nextInt();
          for(int i=0;i<t;i++){
              long n=scn.nextLong();
              String[] s=scn.nextLine().split(" ");
              long sum=0;
              for(int j=0;j<s.length;j++){
                  sum+=Long.parseLong(s[j]);
              }
              if(sum>n){
                  sb.append(sum-n+"\n");
              }else if(sum<n){
                  sb.append(1+"\n");
              }else{
                  sb.append(0+"\n");
              }
          }
          System.out.println(sb);
    }
}
