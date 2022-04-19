// https://www.youtube.com/watch?v=I3V5iyen28A&ab_channel=BroCoders
import java.io.*;
import java.util.*;
public class C_Get_an_Even_String {

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
            char[] s=f.nextLine().toCharArray();
            int[] dp=new int[s.length];
            Arrays.fill(dp, -1);
            int[] last=new int[26];
            Arrays.fill(last, -1);
            for(int i=0;i<s.length;i++){
               int ch=s[i]-'a';
               if(last[ch]==-1){
                   last[ch]=i;
                   if(i>0){
                       dp[i]=dp[i-1];
                   }
               }else{
                   if(last[ch]>0){
                       dp[i]=2+dp[last[ch]-1];
                   }
                   dp[i]=Math.max(dp[i],dp[i-1]);
                   last[ch]=i;
               }
            }
            
            sb.append(s.length-dp[dp.length-1]+"\n");
         }
         System.out.println(sb);
    }
    // static int[] dp;
    // public static int solve(String s,int i){
    //     if(dp[i]!=-1){
    //         return dp[i];
    //     }else if(i>=s.length()){
    //         return 0;
    //     } else if(i==s.length()-1){
    //          dp[i]=1;
    //          return 1;
    //     }else{
    //         int j;
    //         for(j=i+1;j<s.length();j++){
    //             if(s.charAt(i)==s.charAt(j)){
    //                 break;
    //             }
    //         }
    //         if(j==s.length()){
    //             dp[i]=1+solve(s, i+1);
    //             return dp[i];
    //         }else{
    //             int a=1+solve(s,i+1);
    //             int b=j-i-1+solve(s,j+1);
    //             dp[i]=Math.min(a,b);
    //             return dp[i];
    //         }
    //     }


    }
    


    

