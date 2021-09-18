import java.io.*;
import java.util.*;
class CodeChef{
// public class The_Grid_Fill_Problem {

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
           if(n%2==0){
               for(int i=0;i<n;i++){
                   for(int j=0;j<n;j++){
                        sb.append(-1+" ");       
                   }
                   sb.append("\n");
                }
           }else{
               for(int i=0;i<n;i++){
                   for(int j=0;j<n;j++){
                         if(i!=j){
                            sb.append(1+" ");
                        }else{
                            sb.append(-1+" ");
                         }      
                   }
                   sb.append("\n");
                }
           }
         }
         System.out.println(sb);
    }
    }


    

