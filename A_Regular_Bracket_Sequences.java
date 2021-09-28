import java.io.*;
import java.util.*;
public class A_Regular_Bracket_Sequences {

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
           int r=f.nextInt();
           String st="";
           for(int i=0;i<r;i++){
              for(int x=0;x<i;x++){
                  st+="(";
              }
              for(int x=0;x<i;x++){
                  st+=")";
              }
              for(int x=0;x<r-i;x++){
                  st+="(";
              }
              for(int x=0;x<r-i;x++){
                  st+=")";
              }
              sb.append(st+"\n");
              st="";
           }
         }
         System.out.println(sb);
    }
        
    }



    

