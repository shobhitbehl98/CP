import java.io.*;
import java.util.*;
public class A_Square_String_ {

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
           String j=f.nextLine();
           boolean x=true;
           if(j.length()%2!=0){
               x=false;
           }else{
              String d=j.substring(0, j.length()/2);
              String e=j.substring(j.length()/2);
              if(!d.equals(e)){
                  x=false;
              }
           }
           if(x){
               sb.append("YES\n");
           }else{
               sb.append("NO\n");
           }

                 
         }
         System.out.println(sb);
    }
    }


    

