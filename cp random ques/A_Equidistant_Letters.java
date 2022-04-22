/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class A_Equidistant_Letters {

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
            String j=f.nextLine();
            HashMap<Character,Integer> hm=new HashMap<>();
            for(int i=0;i<j.length();i++){
                hm.put(j.charAt(i),hm.getOrDefault(j.charAt(i),0)+1);
            }
            StringBuilder rep=new StringBuilder();
            StringBuilder nrep=new StringBuilder();

            for(char x:hm.keySet()){
                if(hm.get(x)==2){
                    String r=x+""+x;
                   rep.append(r);
                }else{
                   nrep.append(x); 
                }
            }

            String ans=rep.toString()+nrep.toString();
            sb.append(ans+"\n");

            
         }
         System.out.println(sb);
    }
    }


    

