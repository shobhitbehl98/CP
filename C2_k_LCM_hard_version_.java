import java.io.*;
import java.util.*;
// class CodeChef{
public class C2_k_LCM_hard_version_ {

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
            String[] s=f.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            while(k>3){
                sb.append(1+" ");
                k--;
            }
            if (n % 2 == 1) {
                sb.append(n / 2 + " ");
                sb.append(n / 2 + " ");
                sb.append(1 + "\n");
            } else {
                int y = n / 2;
                if (y % 2 == 0) {
                    sb.append(y + " ");
                    sb.append(y / 2 + " ");
                    sb.append(y / 2 + "\n");
                } else {
                    sb.append(2 + " ");
                    sb.append(y - 1 + " ");
                    sb.append(y - 1 + "\n");

                }
            }
            System.out.println(sb);
                 
         }
    }
    }


    

