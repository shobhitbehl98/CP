import java.io.*;
import java.util.*;
public class A_PizzaForces {

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
        //  StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
            // String[] s=f.nextLine().split(" ");
            long in=f.nextLong();
            long ans=0;
            if(in<6){
                ans=15;
            }else{
            if(in%2!=0){
              in++;
            }
            ans=(in*5)/2;
            
        }

            System.out.println(ans);

         }
    }
    }

