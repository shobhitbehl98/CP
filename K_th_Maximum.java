import java.io.*;
import java.util.*;
// public class K_th_Maximum{
class CodeChef {

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
         long t = f.nextInt();
         while(t-->0){
            String[] s=f.nextLine().split(" ");
            String[] m=f.nextLine().split(" ");
            int[] in=new int[s.length];
            int[] se=new int[m.length];
            for(int i=0;i<in.length;i++){
                in[i]=Integer.parseInt(s[i]);
            }
            for(int i=0;i<se.length;i++){
                se[i]=Integer.parseInt(m[i]);
            }
            int max=0;
            for(int i=0;i<se.length;i++){
                if(se[i]>max){
                    max=se[i];
                }
            }
            long ans=0;
            for(int i=in[1]-1;i<se.length;i++){
               if(se[i]==max){
                   ans+=se.length-i;
               } 
            }
             sb.append(ans+"\n");    
         }
         System.out.println(sb);
    }
    }


    

