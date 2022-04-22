import java.io.*;
import java.util.*;
public class Martians_Genome {

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
         String s=f.nextLine();
         int q=f.nextInt();
         int g=f.nextInt();
         while(q-->0){
             String[] m=f.nextLine().split(" ");
             long a=Long.parseLong(m[0]);
             long b=Long.parseLong(m[1]);
             char c=m[2].charAt(0);
             long freq=0;
             long li=0;
             for(int i=0;i<s.length();i++){
                if(c==s.charAt(i)){
                    freq++;
                    li=i;
                }
             }
             li++;
             long ans=((b/li)-(a/li))*freq;

             sb.append(ans+" ");
         }
         System.out.println(sb);
    }
    }

