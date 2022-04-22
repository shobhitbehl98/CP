import java.io.*;
import java.util.*;
public class A_Soft_Drinking {

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
         int n = f.nextInt();
         int k = f.nextInt();
         int l = f.nextInt();
         int c = f.nextInt();
         int d = f.nextInt();
         int p = f.nextInt();
         int nl = f.nextInt();
         int np = f.nextInt();

         int x=(k*l)/nl;
         int y=c*d;
         int z=p/np;
         
         System.out.println(Math.min(x,Math.min(y,z))/n);
    }
    }


    

