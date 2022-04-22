/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
class CodeChef{
// public class Anti_Palindrome {

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
           int z=f.nextInt();
           HashMap<Character,Integer> hm=new HashMap<>();
           String x=f.nextLine();
           int max=0;
           for(int i=0;i<x.length();i++){
               hm.put(x.charAt(i),hm.getOrDefault(x.charAt(i),0)+1);
               max=Math.max(max, hm.get(x.charAt(i)));
           }

           if(x.length()%2==1||hm.size()==1||max>(x.length()/2)){
               sb.append("NO\n");
           }else{
               sb.append("YES\n");
               for(char m:hm.keySet()){
                   int v=hm.get(m);
                   while(v-->0){
                       sb.append(m);
                   }
               }
               
               sb.append("\n");
           }
                 
         }
         System.out.println(sb);
    }
    }


    

