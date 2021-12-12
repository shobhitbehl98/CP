import java.io.*;
import java.util.*;
public class B_Array_Eversion {

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
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=f.nextInt();
            } 
            Stack<Integer> st=new Stack<>();
            int[] ans=new int[n];
            for(int i=(n-1);i>=0;i--){
              while(st.size()>0&&arr[i]>arr[st.peek()]){
                  int g=st.pop();
                  ans[g]=i;
              }
              st.push(i);
            }
            while(st.size()>0){
                int m=st.pop();
                ans[m]=-1;
            }
            int y=n-1;
            int c=0;
            while(ans[y]!=-1){
                c++;
                y=ans[y];
            }
            sb.append(c+"\n");
         }
         System.out.println(sb);
    }
    }


    

