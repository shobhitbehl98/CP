import java.io.*;
import java.util.*;
public class A_I_love__username_ {

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
         int max=Integer.parseInt(s[0]);
         int min=Integer.parseInt(s[0]);
         int ans=0;
         for(int i=1;i<s.length;i++){
              if(Integer.parseInt(s[i])>max){
                  ans++;
                  max=Integer.parseInt(s[i]);
                }else if(Integer.parseInt(s[i])<min){
                  ans++;
                  min=Integer.parseInt(s[i]);
              }
         }
         System.out.println(ans);
                 
    }
    }


    

