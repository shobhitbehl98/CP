import java.io.*;
import java.util.*;
public class Chef_vs_Bharat {

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
         long[] arr=new long[100001];
         for(int i=1;i<arr.length;i++){
             arr[i]=solve(i);
         }
         long[] psa=new long[100001];
         for(int i=1;i<psa.length;i++){
             psa[i]=psa[i-1]+arr[i];
         }
         while(t-->0){
            String[] q=f.nextLine().split(" ");
            int l = Integer.parseInt(q[0]);
            int r = Integer.parseInt(q[1]);
            long val=psa[r]-psa[l];
            sb.append(power(solve(l),val,1000000007)+"\n");
         }
         System.out.println(sb);
    }

    static long power(long x, long y, long p)
  {
    long res = 1; 
 
    x = x % p; 
 
    if (x == 0)
      return 0; 
    while (y > 0)
    {
 
      
      if ((y & 1) != 0)
        res = (res * x) % p;
 
      
      y = y >> 1; 
      x = (x * x) % p;
    }
    return res;
  }

    public static long solve(long g){
      String str=Long.toString(g);
      for(int i=str.length()-2;i>=0;i--){
          str+=str.charAt(i);
        }
        // System.out.println(str+" ");
      return Long.parseLong(str);
    }
    }

