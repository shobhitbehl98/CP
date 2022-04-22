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
         int t=f.nextInt();
         int[] arr=new int[t];
         for(int i=0;i<t;i++){
           arr[i]=f.nextInt();
         }
         int k=f.nextInt();
         HashMap<Integer,Integer> hm=new HashMap<>();
         ArrayList<Integer> li=new ArrayList<>();
         for(int i=0;i<t;i++){
             if(!hm.containsKey(arr[i])){
                 hm.put(arr[i],1);
             }else{
                  hm.put(arr[i],hm.get(arr[i])+1);
             }
             if(i>=k-1){
               li.add(hm.size());
               int y=hm.get(arr[i-k+1]);
               y--;
               if(y==0){
                   hm.remove(arr[i-k+1]);
               }else{
                  hm.put(arr[i-k+1],y);
               }
             }
         }
         for(int i=0;i<li.size();i++){
             System.out.print(li.get(i)+" ");
         }

    }
    }


    

