import java.io.*;
import java.util.*;
class CodeChef{
// public class Crossing_Blocks {

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
            int a=f.nextInt();
            int[] arr=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=f.nextInt();
            }
            int[] ng=new int[a];
            Stack<Integer> st=new Stack<>();
            int i=1;
            st.push(0);
            while(i<arr.length){
              while(st.size()>0&&arr[i]>=arr[st.peek()]){
                  int x=st.pop();
                  ng[x]=i;
              }
              st.push(i);
              i++;
            }
            int ans=0;
            while(st.size()>0){
                int x=st.pop();
                ng[x]=-1;
                ans++;
            }
            if(ng[0]==-1){
                ans--;
            }else if(arr[ng[0]]>arr[0]){
                ans=-1;
            }
                sb.append(ans+"\n");
         }

         System.out.println(sb);
    }
    }


    

