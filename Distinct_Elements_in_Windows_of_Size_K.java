import java.io.*;
import java.util.*;
//class CodeChef
public class Distinct_Elements_in_Windows_of_Size_K {

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
         for(int i=0;i<t;i++){
            arr[i]=f.nextInt();
         }
         int k=f.nextInt();
         HashSet<Integer> hm=new HashSet<>();
         int[] ans=new int[t-k+1];
         int idx=0;
         int d=0;
         int m=0;
         int i=0;
         int r=0;
         while(i<arr.length){
             if(r==k){
                 ans[idx]=d;
                 idx++;
                 d=0;
                 hm=new HashSet<>();
                 m++;
                 i=m;
                 r=0;
                }
                // System.out.println(arr[i]+" ");
             if(!hm.contains(arr[i])){
                 hm.add(arr[i]);
                 d++;
             }
             i++;
             r++;
         }
         ans[idx]=d;

         for(int j=0;j<ans.length;j++){
             System.out.print(ans[j]+" ");
         }
    }
    }


    

