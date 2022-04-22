/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class B_Minor_Reduction {

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
            String s=f.nextLine();
            StringBuilder sbb=new StringBuilder();
            StringBuilder sbt=new StringBuilder();
            String ans="";
            String max="0";
            if(s.length()==0){
                max="0"; 
            }else if(s.length()==1){
                max=s.charAt(0)-'0'+""; 
            }else{
            for(int i=0;i<s.length()-1;i++){
                int sum=(s.charAt(i)-'0')+(s.charAt(i+1)-'0');
                if(sum>9){
                    sbb.append(sum);
                    ans=sbt.toString()+sbb.toString();
                    ans+=s.substring(i+2);
                    max=ans;
                }else if(i==0){
                    sbb.append(sum);
                    ans=sbt.toString()+sbb.toString();
                    ans+=s.substring(i+2);
                    max=ans;
                }
                sbt.append(s.charAt(i));
                sbb=new StringBuilder();
            }
        }

            sb.append(max+"\n");
            
                 
         }
         System.out.println(sb);
    }
    }


    

