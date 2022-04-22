import java.io.*;
import java.util.*;
public class A_Cupboards {

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
         int y=t;
         int rz=0;
         int lz=0;
         int ro=0;
         int lo=0;
         while(t-->0){
            String[] s=f.nextLine().split(" ");
            int l=Integer.parseInt(s[0]);
            int r=Integer.parseInt(s[1]);
            if(l==0){
                lz++;
            }else{
                lo++;
            }
            if(r==0){
                rz++;
            }else{
                ro++;
            }
         }
         System.out.println(Math.min((y-lo),(y-lz))+Math.min((y-ro),(y-rz)));
    }
    }


    

