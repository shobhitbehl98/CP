import java.io.*;
import java.util.*;
public class C_Paint_the_Array {

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
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=f.nextLong();
            }
            long a=arr[0];
            long b=arr[1];
            for(int i=2;i<arr.length;i+=2){
                a=gcd(a,arr[i]);
            }
            for(int i=3;i<arr.length;i+=2){
                b=gcd(b,arr[i]);
            }
            long ans=0;
            if(a!=1){
                ans=a;
               for(int i=1;i<arr.length;i+=2){
                   if(arr[i]%a==0){
                       ans=0;
                       break;
                   }
               } 
            }
            long ans2=0;
            if(b!=1){
                ans2=b;
               for(int i=0;i<arr.length;i+=2){
                if(arr[i]%b==0){
                    ans2=0;
                    break;
                }
            }
        }
            if(ans != 0){
                sb.append(ans+"\n");
            }else if(ans2 != 0){
                sb.append(ans2+"\n");
            }else{
                sb.append(0+"\n");
            }
            
            }
            System.out.println(sb);
                 
         }
         
        
         public static long gcd(long a,long b){
             if(b==0){
                 return a;
                }
                return gcd(b,a%b);
            }
        }


    

