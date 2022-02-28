/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class A_Reverse {

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
            int[] arr=new int[n];
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i]=f.nextInt();
                hm.put(arr[i], i);
            }

            for(int i=0;i<n;i++){
                if(arr[i]!=(i+1)){
                    int j=hm.get(i+1);
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    break; 
                }
            }
            for(int i=0;i<arr.length;i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");



                 
         }
         System.out.println(sb);
    }
    }


    

