import java.io.*;
import java.util.*;
public class Chef_vs_Bharat_partial {

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
            int l=Integer.parseInt(s[0]);
            int r=Integer.parseInt(s[1]);
            long val=solve(l);
            long sum=0;
            long ff=0;
            // for(int j=l+1;j<=r;j++){
            //        ff+=solve((long)j);
            //        System.out.println(solve((long)j)+" sl  sum "+ff);
            //     }
            //     System.out.println("---------------------------------------------------");
                long i=l+1;
            while(i<=r){
               if(i<=9){
                   if(r>=9){
                   double isum=(i+9)*((double)(9-i+1)/2);
                   sum+=isum;
                //    System.out.println(i+" "+9+" "+sum);
                   i=10;
                   }else{
                    double isum=(i+r)*((double)(r-i+1)/2);
                    sum+=isum;
                    // System.out.println(i+" "+(r)+" "+sum);
                    i=r+1; 
                   }
               }else{
                long diff=9-(i%10);
                if(i+diff<=r){
                    double isum=(solve(i)+solve(i+diff))*((double)(diff+1)/2);
                    sum+=(long)isum;
                    // System.out.println(i+" "+(i+diff)+" "+sum);
                    i+=diff+1;
                }else{
                    double isum=(solve(i)+solve(r))*((double)(r-i+1)/2);
                    sum+=isum;
                    // System.out.println(i+" "+(r)+" "+sum);
                    i=r+1;
                }
                }
               }
            //    System.out.println(t+" "+power(val,sum,1000000007)+" "+power(val,ff,1000000007));
               sb.append(power(val,sum,1000000007)+"\n");
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
       String f="";
       while(g>0){
        long y=g%10;
        if(f.length()==0){
            f+=y;
        }else{
           f=(y)+f+(y); 
        }
            g/=10;
        }
        return Long.parseLong(f);
    }
    }

