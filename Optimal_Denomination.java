import java.io.*;
import java.util.*;
public class Optimal_Denomination {

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
    
// public static class pair{
//     long val=1;
//     int idx=0;

//     pair(long val,int idx){
//         this.val=val;
//         this.idx=idx;
//     }
// }
public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
           int n=f.nextInt();
           String[] s=f.nextLine().split(" ");
           long[] arr=new long[n];
           long sumoe=0;
           for(int i=0;i<arr.length;i++){
                arr[i]=Long.parseLong(s[i]);
                sumoe+=arr[i];
           }

           Arrays.sort(arr);
           if(arr.length==1){
               sb.append(1+"\n");
               continue;
           }
        // pair temp=findGCD(arr);
        long[] fr=new long[arr.length];
        long[] ba=new long[arr.length];
         long result = 0;
         long resultb = 0;
         for (int i=0,j=arr.length-1;i<arr.length&&j>=0;i++,j--){
             // long element=u[i];
             // long elb=u[j];
             result = gcd(result, arr[i]);
             fr[i]=result;
             resultb = gcd(resultb, arr[j]);
             ba[j]=resultb;
         }
        //   long max=1;
        //   int idx=0;
        long[] b=new long[arr.length];
         for(int i=0;i<arr.length;i++){
           if(i==0){
               b[i]=ba[i+1];
             }else if(i==arr.length-1){
               b[i]=fr[i-1];
             }else{
               b[i]=gcd(fr[i-1],ba[i+1]);
           }
 
         //   System.out.println(i+" -fr- "+fr[i]+" -ba- "+ba[i]+" -max- "+max+" -idx- "+idx);
         }
         
        long ans=Long.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            ans=Math.min(((sumoe-arr[i]+b[i])/b[i]),ans);
        }       
        sb.append(ans+"\n");
        }
        System.out.print(sb);
         }
    

    public static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
