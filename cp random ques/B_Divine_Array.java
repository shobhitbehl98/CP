/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class B_Divine_Array {

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
           long[][] data=new long[n+1][n];
           HashMap<Long,Long> hn=new HashMap<>();
           for(int i=0;i<data[0].length;i++){
              data[0][i]=f.nextInt();
           }
           for(int j=1;j<data.length;j++){
               for(int i=0;i<data[0].length;i++){
                   if(hn.containsKey(data[j-1][i])){
                       hn.put(data[j-1][i],hn.get(data[j-1][i])+1);
                    }else{
                        hn.put(data[j-1][i],(long)1);
                    }
              }
              for(int i=0;i<data[0].length;i++){
                   data[j][i]=hn.get(data[j-1][i]);
              }
              hn=new HashMap<>();
           }

           int q=f.nextInt();
           for(int i=0;i<q;i++){
               long x=f.nextLong();
               long k=f.nextLong();
               long ans=0;
               
               if(k>=data.length){
                   ans=data[data.length-1][(int)(x-1)];
               }else{
                  ans=data[(int)k][(int)(x-1)]; 
               }
               sb.append(ans+"\n");
           }
         }
         System.out.println(sb);
        }
        
    }


    

