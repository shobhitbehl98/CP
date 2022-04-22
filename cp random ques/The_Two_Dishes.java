import java.io.*;
import java.util.*;
class CodeChef{
// public class The_Two_Dishes {

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
            int n=Integer.parseInt(s[0]);
            int sum=Integer.parseInt(s[1]);
            int se=0;
            int maxd=Integer.MIN_VALUE;
            int diff=0;
           for(int i=0;i<=Math.min(n,sum);i++){
               se=sum-i;
               if(se+i==sum){
                 if(se<=n){
                     diff=Math.abs(se-i);
                 }else{
                     continue;
                 }
               }
               maxd=Math.max(diff,maxd);  
           }
           sb.append(maxd+"\n");
         }
         System.out.println(sb);
    }
    }


    

