import java.io.*;
import java.util.*;
public class A_Integer_Diversity {

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
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<n;i++){
                int a=f.nextInt();
                hm.put(a, hm.getOrDefault(a, 0)+1);
            }
            int z=hm.size();
            for(int val:hm.keySet()){
                int neg=val*-1;
                if(hm.get(val)>1&&val!=0&&!hm.containsKey(neg)){
                    z++;
                }
            }

            sb.append(z+"\n");


                 
         }
         System.out.println(sb);
    }
    }


    

