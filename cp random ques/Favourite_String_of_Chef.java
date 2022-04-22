import java.io.*;
import java.util.*;
class CodeChef{
// public class Favourite_String_of_Chef {

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
            String s=f.nextLine();
            int i=0;
            boolean x=false;
            boolean y=false;
            String a="code";
            String b="chef";
            while(i<n){
                if(s.charAt(i)=='c'&&i+3<n){
                    if(a.equals(s.substring(i, i+4))){
                        x=true;
                    }else if(b.equals(s.substring(i, i+4))){
                        if(x){
                        y=true;
                        }
                        break;
                    }
                }
                i++;
            }
            if(y){
                sb.append("AC\n");
            }else{
                sb.append("WA\n");
            }
                 
         }
         System.out.println(sb);
    }
    }


    

