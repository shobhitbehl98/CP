import java.io.*;
import java.util.*;
// class CodeChef{
public class A_Median_Maximization {

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
            int S=Integer.parseInt(s[1]);
            if(n==1){
                sb.append(S+"\n");
            }else{
            int h=S-(n-1);
            int k=n-(n/2);
            int g=(h+k)/k+1;
            if(g*)
            sb.append((g/k)+1+"\n");
            }    
         }

         System.out.println(sb);
    }
    }


    

