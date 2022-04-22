import java.io.*;
import java.util.*;
//class CodeChef
public class Largest_Subarray_With_Zero_Sum {

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
         int[] arr=new int[t];
         for(int i=0;i<arr.length;i++){
               arr[i]=f.nextInt();
         }
         HashMap<Integer,Integer> hm=new HashMap<>();
         int sum=0;
         int max=0;
         hm.put(0,-1);
         for(int i=0;i<arr.length;i++){
             sum+=arr[i];
             if(hm.containsKey(sum)){
                 max=Math.max(max,(i-hm.get(sum)));
             }else{
                 hm.put(sum,i);
             }
         }

	

         System.out.println(max);
    }
    }


    

