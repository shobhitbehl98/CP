import java.io.*;
import java.util.*;
public class B_Berland_Music {

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
             for(int i=0;i<n;i++){
                 arr[i]=f.nextInt();
             }
             String m=f.nextLine();
             ArrayList<Integer> zero=new ArrayList<>(); 
             ArrayList<Integer> one=new ArrayList<>(); 
             for(int i=0;i<m.length();i++){
                  if(m.charAt(i)=='0'){
                     zero.add(arr[i]);
                  }else{
                     one.add(arr[i]);
                  }
             }
             Collections.sort(zero);
             Collections.sort(one);
             HashMap<Integer,Integer> map=new HashMap<>();
             int x=1;
             for(int i=0;i<zero.size();i++){
                   map.put(zero.get(i),x);
                   x++;
             }
             for(int i=0;i<one.size();i++){
                   map.put(one.get(i),x);
                   x++;
             }
             for(int i=0;i<n;i++){
                 sb.append(map.get(arr[i])+" ");
             }
             sb.append("\n");
         }
         System.out.println(sb);
    }
    }


    

