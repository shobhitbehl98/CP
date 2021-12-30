import java.io.*;
import java.util.*;
public class B_Squares_and_Cubes {

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
            long n=f.nextLong();
            long i=1;
            long k=0;
            HashSet<Long> h=new HashSet<>();
            while(i*i<=n){
                h.add(i*i);
               i++; 
               k++;
            }

            long p=1;
            long m=0;
            while((p*p)*p<=n){
              if(!h.contains(p*p*p)){
                  m++;
                }
                p++;
            }

            sb.append((k+m)+"\n");
         }
         System.out.println(sb);
    }
    }


    

