import java.io.*;
import java.util.*;
public class B_Game_on_Ranges {

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
     public static class Pair implements Comparable<Pair>{
            int x;
            int y;
            int diff;
        
            Pair(int x, int y) {
              this.x = x;
              this.y = y;
              this.diff=y-x;
            }
         public int compareTo(Pair o){
             return this.diff-o.diff;
         }
          }
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
            int n=f.nextInt();
            Pair[] arr=new Pair[n];
            boolean[] fr=new boolean[n+1];

            int p=0;
            while(n-->0){
                int a=f.nextInt();
                int b=f.nextInt();
                arr[p]=new Pair(a,b);
                p++; 
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                for(int j=arr[i].x;j<=arr[i].y;j++){
                     if(!fr[j]){
                         fr[j]=true;
                         sb.append(arr[i].x+" "+arr[i].y+" "+j+"\n");
                         break;
                     }
                }
            }
                 
         }
         System.out.println(sb);
    }
    }


    

