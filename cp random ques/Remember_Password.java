import java.io.*;
import java.util.*;
public class Remember_Password {

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
        String d;
        int length;

        Pair(String d,int length){
            this.d=d;
            this.length=length;
        }

        public int compareTo(Pair o){
            return this.length-o.length; 
        }
    }
    
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         int l = f.nextInt();
         String[] s=f.nextLine().split(" ");
         Pair[] arr=new Pair[s.length];
         for(int i=0;i<arr.length;i++){
             arr[i]=new Pair(s[i],s[i].length());
         }

         Arrays.sort(arr);
         int time=0;
         int tries=0;
         int w=0;
         String real=f.nextLine();
         for(int i=0;i<arr.length;i++){
            if(arr[i].length<real.length()){
                time++;
                tries++;
                if(tries%t==0){
                    time+=5;
                }
            }else if(arr[i].length==real.length()){
                 w++;
            }

         }
         time++;
         sb.append(time+" ");
         time--;
         for(int i=0;i<w-1;i++){
            time++;
                tries++;
                if(tries%t==0){
                    time+=5;
                }
         }
         time++;
         sb.append(time+"\n");
         System.out.println(sb);
    }
    public static void fail(int tries,int time,int t){
        time++;
                tries++;
                System.out.println(tries+" "+t+" "+tries%t);
                if(tries%t==0){
                    time+=5;
                }
                System.out.println(time);
    }

    }


