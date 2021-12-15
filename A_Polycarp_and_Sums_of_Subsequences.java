import java.io.*;
import java.util.*;
public class A_Polycarp_and_Sums_of_Subsequences {

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
             int[] arr=new int[7];
            for(int i=0;i<7;i++){
                 arr[i]=f.nextInt();
            }
            sb.append(arr[0]+" "+arr[1]+" ");
            if(arr[0]+arr[1]==arr[2]){
              sb.append(arr[3]+"\n");
            }else{
                sb.append(arr[2]+"\n");
            }
                 
         }
         System.out.println(sb);
    }
    }


    

