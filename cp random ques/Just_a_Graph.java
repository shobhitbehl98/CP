import java.io.*;
import java.util.*;
// class CodeChef{
public class Just_a_Graph {

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
            int h=f.nextInt(); 
            String[] s=f.nextLine().split(" ");
            int tot=0;
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<s.length;i++){
                int y=i-Integer.parseInt(s[i]);
                if(hm.containsKey(y)==false){
                 hm.put(y,1);
                }else{
                 hm.put(y,hm.get(y)+1);
                }
             }
             if(hm.size()==1){
                 sb.append(s.length+"\n");
             }else{
                 sb.append(1+"\n");
             }
         }
         System.out.print(sb);
    }
   
    }


    

