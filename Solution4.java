/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
// class CodeChef{
public class Solution4 {

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
            TreeMap<Integer,Integer> hm=new TreeMap<>();
            for(int i=0;i<2*n;i++){
                int g=f.nextInt();
                hm.put(g,hm.getOrDefault(g,0)+1);
            }

            boolean c=true;
            for(int i=0;i<hm.entrySet().size();i++){
                if(!hm.containsKey(i)){
                    break;
                }

                if(hm.get(i)==1){
                    c=false;
                    break;
                }
            }
            System.out.println(c?"YES":"NO"+"\n");
        }
    }
}




