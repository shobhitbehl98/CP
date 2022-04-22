import java.io.*;
import java.util.*;
//class CodeChef
//public class Solution{
public class Task {

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
         int z=1;
         while(t-->0){
            int n=f.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
              arr[i]=f.nextInt();
            }
            int prev=-1,ans=0;
            for(int i=0;i<n;i++){
                if(arr[i]>prev){
                    prev=arr[i];
                    if(i+1<arr.length){
                        if(arr[i]>arr[i+1]){
                            ans++;
                        }
                    }else{
                        ans++;
                    }
                }
            }
            sb.append("Case #"+(z++)+": "+ans+"\n");
                
         }
         System.out.println(sb);
    }
    }


    

