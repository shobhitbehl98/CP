/*

e.g in case of 38 if we factorize it we will have 2*17 which means it is only divisible by 2 or 2^1.It can only divide by 2 once before this number and hence the G.C.D of entire sequence becomes odd.

in case of 36 factorization is 2*2*3*3 which means it can divide by 2 twice before the no becomes odd and hence the gcd of the number is odd. It is divisible by 2^2.

16 2^4 p=4

So what we have to do is iterate through each number and find out till which power of 2 the number is divisible (maximum no of p in which arr[i] is divisible by 2^p, arr[i] is not divisble by 2^p+1)
Find the value of this 'p' of each element and return the minimum value of p as the answer.

*/
import java.io.*;
import java.util.*;
class CodeChef{
// public class Odd_GCD_1 {

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
            int k=f.nextInt();
            int min=Integer.MAX_VALUE;
            for(int i=0;i<k;i++){
                int j=f.nextInt();
                min=Math.min(getpow(j), min);
            }
            
        sb.append(min+"\n");
         }
         System.out.println(sb);
    }

    public static int getpow(int x){
        int i=1;
        while(x%Math.pow(2,i)==0){
             i++;
        }
        return i-1;
    }
    }


    

