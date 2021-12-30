import java.io.*;
import java.util.*;
public class A_Long_Comparison {

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
             long x=f.nextLong();
             long px=f.nextLong();
             long y=f.nextLong();
             long py=f.nextLong();
             if(px>py){
                 while(px>py){
                   x*=10;
                   px--;
                   if(x>y){
                       break;
                   }
                 }
             }else if(px<py){
                while(py>px){
                    y*=10;
                    py--;
                    if(y>x){
                        break;
                    }
                  }
             }
            if(x>y){
                sb.append(">\n");
            }else if(x<y){
                sb.append("<\n");
            }else{
                sb.append("=\n");
            }
         }
         System.out.println(sb);
    }
    
    }


    

