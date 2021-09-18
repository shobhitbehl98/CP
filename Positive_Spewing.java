import java.io.*;
import java.util.*;
// class CodeChef{
public class Positive_Spewing {

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
            long n=f.nextLong();
            long k=f.nextLong(); 
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=f.nextInt();
            }

            boolean z=true;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    z=false;
                    break;
                }
            }
            if(z){
                sb.append(0+"\n");
                continue;
            }
            if(k==0){
                long r=0;
                for(int j=0;j<arr.length;j++){
                    res+=
                }
            }

                 
         }
    }
    }


    

