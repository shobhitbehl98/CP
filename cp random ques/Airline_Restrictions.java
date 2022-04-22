import java.io.*;
import java.util.*;
class CodeChef{
// public class Airline_Restrictions {

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
            int[] arr=new int[s.length];
            for(int i=0;i<arr.length;i++){
                arr[i]=Integer.parseInt(s[i]);
            }
            Arrays.sort(arr,0,3);
            if(arr[0]<=arr[4]&&arr[1]+arr[2]<=arr[3]||arr[1]<=arr[4]&&arr[0]+arr[2]<=arr[3]||arr[2]<=arr[4]&&arr[0]+arr[1]<=arr[3]){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
         }
         System.out.println(sb);
    }
    }


    

