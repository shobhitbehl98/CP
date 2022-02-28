/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
class CodeChef{
// public class Points_and_Lines {

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
            int n=f.nextInt();
            HashMap<Integer,Integer> x=new HashMap<>();
            HashMap<Integer,Integer> y=new HashMap<>();
            while(n-->0){
                int xp=f.nextInt();
                int yp=f.nextInt();
                x.put(xp,x.getOrDefault(xp,0)+1);
                y.put(yp,y.getOrDefault(yp,0)+1);
            }

            sb.append((x.size()+y.size())+"\n");
                 
         }
         System.out.println(sb);
    }
    }


    

