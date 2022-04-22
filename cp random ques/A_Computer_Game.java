import java.io.*;
import java.util.*;
public class A_Computer_Game {

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
            String[] u=f.nextLine().split("");
            String[] l=f.nextLine().split("");
            boolean ans=false;
            for(int i=0;i<n;i++){
                int a=Integer.parseInt(u[i]);
                int b=Integer.parseInt(l[i]);
                if((a&b)==1){
                    ans=true;
                    break;
                }
            }
            if(ans){
                sb.append("NO\n");
            }else{
                sb.append("YES\n");
            }     
         }
         System.out.println(sb);
    }
    }


    

