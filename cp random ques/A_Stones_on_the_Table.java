import java.io.*;
import java.util.*;
public class A_Stones_on_the_Table {

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
         int t = f.nextInt();
         String d=f.nextLine();
         Stack<Character> st=new Stack<>();
         st.push(d.charAt(0));
         for(int i=1;i<d.length();i++){
            if(st.peek()!=d.charAt(i)){
                st.push(d.charAt(i));
            }
         }
         System.out.println(t-st.size());
    }
    }


    

