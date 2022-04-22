import java.io.*;
import java.util.*;
public class Mimimum_Cost_to_Connect_All_Cities {

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
         int v=f.nextInt();
         int e=f.nextInt();
         ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
         for(int i=0;i<v;i++){
             graph.add(new ArrayList<>());
         }

         for(int i=0;i<e;i++){
             int a=f.nextInt()-1;
             int b=f.nextInt()-1;
             graph.get(a).add(b);
         }
    }
    }


    

