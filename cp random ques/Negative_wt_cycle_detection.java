import java.io.*;
import java.util.*;
public class Negative_wt_cycle_detection {

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
         String[] s=f.nextLine().split(" ");//5 5
         int[][] arr=new int[Integer.parseInt(s[1])][3];
         for(int i=0;i<Integer.parseInt(s[1]);i++){
         String[] d=f.nextLine().split(" ");
         arr[i][0]=Integer.parseInt(d[0]);
         arr[i][1]=Integer.parseInt(d[1]);
         arr[i][2]=Integer.parseInt(d[2]);
    }

    int[] pwt=new int[Integer.parseInt(s[0])];
    Arrays.fill(pwt,Integer.MAX_VALUE);
    pwt[0]=0;
    for(int i=1;i<Integer.parseInt(s[0]);i++){
        for(int j=0;j<arr.length;j++){
            if(pwt[arr[j][0]]<Integer.MAX_VALUE&&(pwt[arr[j][0]]+arr[j][2])<pwt[arr[j][1]]){
                pwt[arr[j][1]]=pwt[arr[j][0]]+arr[j][2];
            }
        }  
    }
    boolean x=false;
    for(int j=0;j<arr.length;j++){
        if((pwt[arr[j][0]]+arr[j][2])<pwt[arr[j][1]]){
          x=true;
          break;
        }
    }
    if(x){
        sb.append(1);
    }else{
        sb.append(0);
    }
    System.out.println(sb);
    }
    }

