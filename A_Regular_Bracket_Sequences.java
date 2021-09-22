import java.io.*;
import java.util.*;
public class A_Regular_Bracket_Sequences {

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
           int r=f.nextInt();
           ArrayList<ArrayList<String>> h=new ArrayList<>();
           for(int i=0;i<r+1;i++){
               if(i==0){
                   h.add(new ArrayList<>());
               }else if(i==1){
                   ArrayList<String> al=new ArrayList<>();
                   al.add("()");
                   h.add(al);
               }else{
                   for(int j=i-1;j>=1;j--){
                       for(int m=0;m<h.get(j).size();m++){
                       for(int k=0;k<h.get(i-j).size();k++){
                          sb.append(h.get(j).get(m)+h.get(i-j).get(k)+"\n");
                       }
                    }
                   }
               }
           }
         }
         System.out.println(sb);
    }
        
    }



    

