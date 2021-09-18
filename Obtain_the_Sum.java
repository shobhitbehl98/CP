import java.io.*;
import java.util.*;
class CodeChef{
// public class Obtain_the_Sum {

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
            String[] s=f.nextLine().split(" ");
            long n=Long.parseLong(s[0]);
            long sum=Long.parseLong(s[1]);
            long ans=(n*(n+1))/2;
            ans-=sum;
            if(ans>=1 &&ans<=n){
                sb.append(ans+"\n");
            }else{
                sb.append(-1+"\n");
            }
           
         }
         System.out.println(sb);
    }
    }


    

