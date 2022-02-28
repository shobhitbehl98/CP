/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
class CodeChef{
// public class Yet_Another_Constructive_Problem {

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
           sb.append(n+" ");
           int x=n;
           int i=0;
           int p=0;
           while(i<32){
              if((x&(1<<i))>0){
                  p=i;
              }
              i++;
           }
           
           int j=1<<p;
           if(j==n){
              if(invertBits(j+1)!=0){
                  sb.append((j+1)+" "+invertBits(j+1)+"\n");
                }else{
                  sb.append((j+2)+" "+invertBits(j+2)+"\n");
              }
           }else{
               if(invertBits(j)!=0){
              sb.append(j+" "+invertBits(j)+"\n");
            }else{
                sb.append((j+1)+" "+invertBits(j+1)+"\n");
            }
           }
  
         }
         System.out.println(sb);
    }
    static int invertBits(int n) 
{ 
    // Calculate number of bits of N-1;
    int i=0;
    int p=0;
    // System.out.println(Long.toBinaryString(n)); 
    while(i<32){
        // System.out.println(((n&(1<<i))+" v "+i+" "+n+" "+p));
        if((n&(1<<i))>0){
            p=i;
        }
        i++;
     }
    int x=0;
    for(int j=0;j<=p;j++){
       if((n&(1<<j))==0){
           x|=(1<<j);
       }
    }
    // System.out.println(n+ "-*-"+ Long.toBinaryString(n)+" "+p);
    // System.out.println(x+ "--"+ Long.toBinaryString(x));
    return x;
} 
    }


    

