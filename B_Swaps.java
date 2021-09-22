import java.io.*;
import java.util.*;
public class B_Swaps {

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
            String[] a=f.nextLine().split(" ");
            String[] b=f.nextLine().split(" ");
            int[] num=new int[(2*n)+1];
            for(int i=0;i<a.length;i++){
              int an=Integer.parseInt(a[i]); 
              int bn=Integer.parseInt(b[i]);
              num[an]=i; 
              num[bn]=i; 
            }
            int k=num.length;
            for(int i=k-3;i>=0;i-=2){
                if(num[i]>num[i+2]){
                    num[i]=num[i+2];
                }
            }
            int ans=2*(n-1);
            for(int i=1;i<num.length;i+=2){
                ans=Math.min(ans,num[i]+num[i+1]);
            }

            sb.append(ans+"\n");
         }
         System.out.println(sb);
    }
    }


    

