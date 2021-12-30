import java.io.*;
import java.util.*;
public class C1_k_LCM_easy_version_ {

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
            int k=f.nextInt();
            if(n%2==0){
                if(n%4==0){
                  sb.append(n/2+" "+n/4+" "+n/4+"\n");
                }else{
                int j=(n-2)/2;
                sb.append(2+" "+j+" "+j+"\n");
                }
            }else{
                int j=(n-1)/2;
                sb.append(1+" "+j+" "+j+"\n");
            }
                 
         }
         System.out.println(sb);
    }
    }


    

