import java.io.*;
import java.util.*;
public class A_Is_your_horseshoe_on_the_other_hoof_ {

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
         String[] s=f.nextLine().split(" ");
         HashSet<Integer> h=new HashSet<>();
         int ans=0;
         for(int i=0;i<s.length;i++){
             if(h.contains(Integer.parseInt(s[i]))){
                 ans++;
             }else{
                 h.add(Integer.parseInt(s[i]));
             }
         }

         System.out.print(ans);

                 
    }
    }


    

