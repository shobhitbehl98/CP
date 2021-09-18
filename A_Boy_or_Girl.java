import java.io.*;
import java.util.*;
public class A_Boy_or_Girl {

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
         String x=f.nextLine();
         HashSet<Character> h=new HashSet<>();
         int ans=0;
         for(int i=0;i<x.length();i++){
             if(!h.contains(x.charAt(i))){
                 ans++;
                 h.add(x.charAt(i));
             }
         }

         if(ans%2==1){
             System.out.println("IGNORE HIM!");
         }else{
             System.out.println("CHAT WITH HER!");
         }
    }
    }


    

