import java.io.*;
import java.util.*;
public class B_Effective_Approach {

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
         int x=f.nextInt();
         String[] g=f.nextLine().split(" ");
         int a=0;
         int b=0;
         int c=0;
         int d=0;
         int i=0;
         while(i<g.length){
             for(int j=0;j<s.length;j++){
                 if(i==g.length)break;
                 int h=Integer.parseInt(s[j]);
                 a++;
                 if(h==Integer.parseInt(g[i])){
                     c=a;
                     i++;
                    }
                }
            }
            i=0;
            while(i<g.length){
                for(int j=s.length-1;j>=0;j--){
                 if(i==g.length)break;
                 int h=Integer.parseInt(s[j]);
                 b++;
                 if(h==Integer.parseInt(g[i])){
                      d=b;
                      i++;
                 }
             }
         }

         System.out.println(c+" "+d);

    }
    }


    

