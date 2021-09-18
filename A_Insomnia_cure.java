import java.io.*;
import java.util.*;
public class A_Insomnia_cure {

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
         int k = f.nextInt();
         int l = f.nextInt();
         int m = f.nextInt();
         int n = f.nextInt();
         int d = f.nextInt();
         int[] a={k,l,m,n};
         boolean[] arr=new boolean[d+1];
         for(int i=0;i<a.length;i++){
            int h=1; 
            while(h*a[i]<arr.length){
                arr[h*a[i]]=true;
                h++;
            }
         }
         int ans=0;
         for(int i=1;i<arr.length;i++){
             if(arr[i]){
                 ans++;
             }
         }
         System.out.println(ans);
    }
    }


    

