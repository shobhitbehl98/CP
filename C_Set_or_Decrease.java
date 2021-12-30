import java.io.*;
import java.util.*;
public class C_Set_or_Decrease {

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
           int k=f.nextInt();
           int[] arr=new int[n];
           int sum=0;
           for(int i=0;i<n;i++){
               arr[i]=f.nextInt();
               sum+=arr[i];
           }
           Arrays.sort(arr);
           int p=arr.length-1;
           int st=0;
           int j=Integer.MAX_VALUE;
           while(p>0&&arr[p]>arr[0]&&sum>k){
            //    System.out.println(arr[p]+" "+sum+" "+st);
               if(st>0){
                   j=Math.min((sum/st)+st,j);
               }
               sum-=(arr[p]-arr[0]);
               st++;
               p--;
            }
           
            if(sum>k){
               st+=sum-k;
           }

           int ans=Math.min(st,j);
           
           sb.append(ans+"\n");
         }
         System.out.println(sb);
    }
    }


    

