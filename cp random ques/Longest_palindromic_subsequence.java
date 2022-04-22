import java.io.*;
import java.util.*;

public class Longest_palindromic_subsequence {
    
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
         String t = f.nextLine();
         String r = f.nextLine();
         int[][] arr =new int[t.length()+1][r.length()+1];
         for(int i=1;i<arr.length;i++){
             for(int j=1;j<arr[0].length;j++){
               if(t.charAt(i-1)==r.charAt(j-1)){
                   arr[i][j]=arr[i-1][j-1]+1;
               }else{
                   arr[i][j]=Math.max(arr[i][j-1],arr[i-1][j]);
               }
             }
         }

         System.out.println(arr[arr.length-1][arr[0].length-1]);
    }
}
