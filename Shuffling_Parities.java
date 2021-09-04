import java.io.*;
import java.util.*;
class CodeChef{
// public class Shuffling_Parities {

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
            int odd=s.length/2;
            int even=s.length/2;
            if(s.length%2==1){
               odd++;
            }
            int ans=0;
            for(int i=0;i<s.length;i++){
              int x=Integer.parseInt(s[i]);
              if(x%2==0&&odd>0){
                  ans++;
                  odd--;
              }else if(x%2==1&&even>0){
                  ans++;
                  even--;
              }
            }
            sb.append(ans+"\n");
         }
         System.out.println(sb);
    }
    }


    

