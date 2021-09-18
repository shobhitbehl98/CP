import java.io.*;
import java.util.*;
public class A_Ultra_Fast_Mathematician {

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
         String t = f.nextLine();
         String n=f.nextLine();
         String ans="";
         int tc=t.length()-1;
         int nc=n.length()-1;
         while(tc>=0&&nc>=0){
             int h=t.charAt(tc)-'0';
             int g=n.charAt(nc)-'0';
             int v=(h^g);
            //  System.out.println(v);
             ans=v+ans;
             tc--;
             nc--;
         }

         System.out.println(ans);
    }
    }


    

