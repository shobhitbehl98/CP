import java.io.*;
import java.util.*;
class CodeChef{
// public class Xor_Equality {

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
         int[] ans=new int[100000+5];
         pow(ans);
         while(t-->0){
            int n=f.nextInt();
            sb.append(ans[n]+"\n");
         }
         System.out.println(sb);
    }

    public static void pow(int[] ans){
        ans[1]=1;
        for(int i=2;i<ans.length;i++){
            ans[i]=(ans[i-1]*2)%1000000007;
        }
    }
  
    }


    

