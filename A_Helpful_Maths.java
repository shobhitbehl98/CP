import java.io.*;
import java.util.*;
public class A_Helpful_Maths {

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
         String line=f.nextLine();
         ArrayList<Integer> al=new ArrayList<>();
         for(int i=0;i<line.length();i++){
             if(line.charAt(i)!='+'){
             al.add(line.charAt(i)-'0');
             }
         }
         Collections.sort(al);

         for(int i=0;i<al.size()-1;i++){
             sb.append(al.get(i)+"+");
         }
         sb.append(al.get(al.size()-1));
          System.out.println(sb);
    }
    }


    

