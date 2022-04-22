/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
class CodeChef{
// public class Count_Number_of_Peaks {

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
            aal=new ArrayList<>();
            ArrayList<Integer> a=new ArrayList<>();
            rec(n,a);
            int m=0;
            for(int i=0;i<aal.size();i++){
                // System.out.println(aal.get(i).size());
                if(aal.get(i).size()<3){
                    continue;
                }
                for(int j=1;j<aal.get(i).size()-1;j++){
                    // System.out.println(aal.get(i).get(j-1)+" "+aal.get(i).get(j)+" "+aal.get(i).get(j+1)+"  "+i+"  "+j);
                    if((aal.get(i).get(j-1)<aal.get(i).get(j)&&aal.get(i).get(j+1)<aal.get(i).get(j))||(aal.get(i).get(j-1)>aal.get(i).get(j)&&aal.get(i).get(j+1)>aal.get(i).get(j))){
                        m++;
                    }
                }
            }
            System.out.println(m);     
         }


    }
    public static ArrayList<ArrayList<Integer>> aal;
    public static void rec(int n,ArrayList<Integer> al){
        if(n==0){
            ArrayList<Integer> base=new ArrayList<>();
            for(int i=0;i<al.size();i++){
                   base.add(al.get(i));
            }
            aal.add(base);
            return; 
        }
        al.add(0);
        rec(n-1,al);
        al.remove(al.size()-1);
        al.add(1);
        rec(n-1,al);
        al.remove(al.size()-1);
        al.add(2);
        rec(n-1,al);
        al.remove(al.size()-1);
        
    }
    }


    

