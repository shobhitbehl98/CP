/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class permutation_I {

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
         String s=f.nextLine();

        rec(s,"");
        ArrayList<String> m=recret(s);
        System.out.println(m);
    }

    public static void rec(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        boolean[] map=new boolean[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(!map[idx]){
            map[idx]=true;
            String roq=s.substring(0,i)+s.substring(i+1);
            rec(roq,ans+ch);
            }
        }

    }
    public static ArrayList<String> recret(String s){
        ArrayList<String> al=new ArrayList<>();
        if(s.length()==0){
           ArrayList<String> base=new ArrayList<>();
           base.add("");
           return base;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String roq = s.substring(0,i) + s.substring(i+1);
            ArrayList<String> r = recret(roq);
           for(int j = 0;j<r.size();j++){
               String x=r.get(j);
               al.add(ch+x);
           }          
        }

        return al;

    }
    }


    

