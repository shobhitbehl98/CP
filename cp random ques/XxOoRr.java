import java.io.*;
import java.util.*;
public class XxOoRr {

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
            String[] k=f.nextLine().split(" ");
            int[] m=new int[32]; 
            for(int i=0;i<k.length;i++){
                int[] ans=decToBinary(Integer.parseInt(k[i]));
                for(int j=m.length-1;j>=0;j--){
                    m[j]+=ans[j];
                }
            }
            int q=0;
            int x=Integer.parseInt(s[1]);
            for(int i=0;i<m.length;i++){
                if(m[i]%x!=0){
                  q+=(m[i]/x)+1;
                }else{
                  q+=m[i]/x;
                }
            }

            sb.append(q+"\n");

         }
         System.out.println(sb);
    }

    public static int[] decToBinary(int n)
    {
        int[] binaryNum = new int[32];
   
        int i = 31;
        while (n > 0) 
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i--;
        }
        return binaryNum;
    }


}
