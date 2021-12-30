import java.io.*;
import java.util.*;
public class A_Robot_Cleaner {

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
            int ax=f.nextInt();
            int ay=f.nextInt();
            int bx=f.nextInt();
            int by=f.nextInt();
            int mina=0;
            int minb=0;
            if(bx>=ax){
                mina=bx-ax;
            }else{
                mina=(2*n)-(bx+ax);
            }
            if(by>=ay){
                minb=by-ay;
            }else{
                minb=(2*m)-(by+ay);
            }
            sb.append(Math.min(mina,minb)+"\n");
         }
         System.out.println(sb);
    }
    }


    

