/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class A_Windblume_Ode {

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
         boolean[] sie=new boolean[20001];
         for(int i=2;i*i<20001;i++){
            if(!sie[i]){
                int k=2;
                while(i*k<sie.length){
                    sie[i*k]=true;
                    k++;
                }
            }
         }
         while(t-->0){
             int n=f.nextInt();
             int[] arr=new int[n];
             int[] ab=new int[n];
             for(int i=0;i<arr.length;i++){
                 arr[i]=f.nextInt();
                }
                ab[0]=arr[0];
                for(int i=1;i<ab.length;i++){
                    ab[i]=ab[i-1]+arr[i];
                }
             for(int i=ab.length-1;i>=0;i--){
                  if(sie[ab[i]]){
                      sb.append(i+1+"\n");
                      break;
                  }else{
                      int u=i;
                      while(u>=0&&!sie[ab[i]-arr[u]]){
                          u--;
                      }
                      if(u>=0){
                          sb.append(i+"\n"+);
                          break;
                      }
                  }
             }

         }
         System.out.println(sb);
    }
    }


    

