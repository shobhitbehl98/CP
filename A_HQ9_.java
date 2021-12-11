import java.io.*;
import java.util.*;
public class A_HQ9_ {

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
         String t = f.nextLine();
         HashSet<Character> hs=new HashSet<>();
         hs.add('H');
         hs.add('Q');
         hs.add('9');
         boolean m=false;
         for(int i=0;i<t.length();i++){
             if(hs.contains(t.charAt(i))){
                 m=true;
                 break;
             }
         }
         if(m){
             System.out.println("YES");
         }else{
             System.out.println("NO");
         }
    }
    }


    

