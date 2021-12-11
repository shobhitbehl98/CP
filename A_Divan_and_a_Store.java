import java.io.*;
import java.util.*;
public class A_Divan_and_a_Store {

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
            int l=f.nextInt();
            int r=f.nextInt();
            int k=f.nextInt();
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int i=0;i<n;i++){
                int p=f.nextInt();
                if(p>=l&&p<=r){
                pq.add(p);
                }
            }
            int ans=0;
            while(pq.size()>0){
                int h=pq.remove();
                if(k-h>=0){
                k-=h;
                ans++;
                }else{
                    break;
                }
            } 
            sb.append(ans+"\n");
         }
         System.out.println(sb);
    }
    }


    

