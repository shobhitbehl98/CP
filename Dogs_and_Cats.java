/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class Solution{
// public class Dogs_and_Cats {

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
         int z=1;
         while(t-->0){
            int n=f.nextInt();
            int d=f.nextInt();
            long c=f.nextLong();
            int m=f.nextInt();
            char[] s=f.nextLine().toCharArray();
            int last=-1;
            for(int i=0;i<s.length;i++){

               if(s[i]=='D'){
                   last=i;
               }
            }
            
            boolean x=false;
            int i=0;
            while(i<=last){

                if(s[i]=='D'&&d>0){
                     d--;
                     c+=m;
                }else if(s[i]=='C'&&c>0){
                    c--;
                }else{
                    break;
                }
                i++;
            }
            if(i>last||i==-1){
                sb.append("CASE #"+z+": YES\n");
            }else{
                sb.append("CASE #"+z+": NO\n");
            }
             z++;    
         }
         System.out.println(sb);
    }
    }


    

