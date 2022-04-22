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
            int[] arr=new int[(2*n)+1];
            for(int i=1,j=0;i<arr.length&&j<a.length;i+=2,j++){
                int x=Integer.parseInt(a[j]);
                arr[x]=j;
            }
            int ans=Integer.MAX_VALUE;
            for(int i=2,j=0;i<arr.length&&j<b.length;i+=2,j++){
                int x=Integer.parseInt(b[j]);
                arr[x]=j;
            }
            int minod=n;
            for(int i=1;i<arr.length;i++){
              if(i%2==1){
                  minod=Math.min(minod,arr[i]);
              }else{
                  ans=Math.min(minod+arr[i],ans);
              }
            }

            sb.append(ans+"\n");
         }
         System.out.println(sb);
    }
    }


    

