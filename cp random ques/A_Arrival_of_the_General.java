import java.io.*;
import java.util.*;
public class A_Arrival_of_the_General {

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
         String[] s=f.nextLine().split(" ");
         int[] arr=new int[t];
         int max=0,min=0;
         for(int i=0;i<arr.length;i++){
             arr[i]=Integer.parseInt(s[i]);
             if(arr[i]>arr[max]){
                 max=i;
             }
             if(arr[i]<=arr[min]){
                 min=i;
             }
         }
         int ans=0;
         if(max>min){
           ans=(max-0)+((arr.length-1)-min)-1;
         }else{
            ans=(max-0)+((arr.length-1)-min);
         }
         System.out.println(ans);
         
    }
    }


    

