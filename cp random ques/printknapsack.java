import java.io.*;
import java.util.*;
public class printknapsack {

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

     public static class Pair {
        int i;
        int j;
        String psf;
    
        Pair(int i, int j,String psf) {
          this.i = i;
          this.j = j;
          this.psf=psf;
        }
    
      }
    
    public static void main(String[] args){
         FastReader f=new FastReader();
         int n = f.nextInt();
         int[] values = new int[n];
         String str1 = f.nextLine();
         for (int i = 0; i < n; i++) {
             values[i] = Integer.parseInt(str1.split(" ")[i]);
         }
 
         int[] wts = new int[n];
         String str2 = f.nextLine();
         for (int i = 0; i < n; i++) {
             wts[i] = Integer.parseInt(str2.split(" ")[i]);
         }
 
         int cap =f.nextInt();
 
         int[][] dp=new int[n+1][cap+1];

         for(int i=1;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(j>=wts[i-1]){
                    dp[i][j]=Math.max(dp[i-1][j],(values[i-1]+dp[i-1][j-wts[i-1]]));
                }else{
                    dp[i][j]=dp[i-1][j];
                }
                // System.out.print(dp[i][j]+" ");
            }
            // System.out.println();
        }

        System.out.println(dp[dp.length-1][dp[0].length-1]);

        LinkedList<Pair> qu=new LinkedList<>();
        qu.addLast(new Pair(dp.length-1,dp[0].length-1,""));
        while(qu.size()>0){
           Pair rem=qu.removeFirst();
           if(rem.j==0||rem.i==0){
               System.out.println(rem.psf);
               continue;
           }

            if(rem.j>=wts[rem.i-1]){
           
            if(dp[rem.i-1][rem.j]<values[rem.i-1]+dp[rem.i-1][rem.j-wts[rem.i-1]]){
               qu.addLast(new Pair(rem.i-1,(rem.j-wts[rem.i-1]),(rem.i-1)+" "+rem.psf));
            }
           if(dp[rem.i-1][rem.j]>values[rem.i-1]+dp[rem.i-1][rem.j-wts[rem.i-1]]){
               qu.addLast(new Pair(rem.i-1,rem.j,rem.psf));
            }
        }else{
            qu.addLast(new Pair(rem.i-1,rem.j,rem.psf));
        }
            
        }
    }
    }


    

