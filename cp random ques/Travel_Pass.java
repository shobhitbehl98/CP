import java.io.*;
import java.util.*;
class CodeChef{
// public class Travel_Pass {

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
            String[] s=f.nextLine().split(" ");
            int[] arr1=new int[s.length];
            for(int i=0;i<s.length;i++){
                arr1[i]=Integer.parseInt(s[i]);
            }
            int ans=0;
            String g=f.nextLine();
            for(int i=0;i<g.length();i++){
                if(g.charAt(i)=='0'){
                   ans+=arr1[1];
                }else{
                 ans+=arr1[2];
                }
            }
            sb.append(ans+"\n");
         }
         System.out.print(sb);
    }
    }


    

