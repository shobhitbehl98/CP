import java.io.*;
import java.util.*;
//class CodeChef
public class extended_euclidian_algorithm {

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
    public static class tri{
        int x;
        int y;
        int gcd;

        tri(int x,int y,int gcd){
            this.x=x;
            this.y=y;
            this.gcd=gcd;
        }
    }
    public static tri ext(int a,int b){
       if(b==0){
           tri base=new tri(1,0,a);
           return base;
       }
k
       tri small=ext(b,a%b);
       tri ans=new tri(small.y,small.x-(a/b)*small.y,small.gcd);
       return ans;
    }
    public static void main(String[] args){
         FastReader f=new FastReader();
         int a=f.nextInt();
         int b=f.nextInt();
         tri ans=ext(a,b);
         System.out.println(ans.x+" "+ans.y+" "+ans.gcd);
         
    }
    }


    

