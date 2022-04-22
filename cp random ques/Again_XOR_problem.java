/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
class CodeChef{
// public class Again_XOR_problem {

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
             int k=f.nextInt();
             char[] s=f.nextLine().toCharArray();
             int ans=0;
             int xo=0;
             for(int i=0;i<=n-k;i++){
                 xo^=s[i]-'0';
                }
                if(xo==1){
                    ans++;
                }
             int b=0;
             int e=n-k+1;
             while(e<n){
                 xo^=(s[b++]-'0');
                 xo^=(s[e++]-'0');
                 if(xo==1){
                     ans++;
                 }
             }
             System.out.println(ans); 
         }
    }

    public static int bintoint(String g){
        int k=0;
        int val=0;
         for(int i=g.length()-1;i>=0;i--){
             char ch=g.charAt(i);
             if(ch=='1'){
                val+=(int)Math.pow(2,k);
             }
             k++;
         }

         return val;

    }
    }


    

