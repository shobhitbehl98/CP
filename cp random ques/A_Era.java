import java.io.*;
import java.util.*;
public class A_Era {

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
           int[] arr=new int[n];
           for(int i=0;i<arr.length;i++){
               arr[i]=f.nextInt();
           }
           int c=0;
           for(int i=0;i<arr.length;i++){
               if(arr[i]>(i+c+1)){
                   int diff=arr[i]-(i+c+1);
                   c+=diff;
               }
           }

           sb.append(c+"\n");
         }
         System.out.println(sb);
    }
    }


    

