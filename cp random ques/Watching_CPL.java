import java.io.*;
import java.util.*;
public class Watching_CPL {

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
            String[] s=f.nextLine().split(" ");
            String[] b=f.nextLine().split(" ");
            int[] in=new int[s.length];
            Integer[] bo=new Integer[b.length];

            for(int i=0;i<in.length;i++){
                in[i]=Integer.parseInt(s[i]);
            }
            for(int i=0;i<bo.length;i++){
                bo[i]=Integer.parseInt(b[i]);
            }

            Arrays.sort(bo,Collections.reverseOrder());
           HashMap<Integer,int[] > dp=new HashMap<>();
           int ans=rec(bo,0,in[1],0,0,0,0,dp);
           if(ans==Integer.MAX_VALUE){
               ans=-1;
           }
           sb.append(ans+"\n");
                 
         }
         System.out.println(sb);
    }
    
    public static int rec(Integer[] bo,int i,int t,int res1,int res2,int c1,int c2,HashMap<Integer,int[] > dp){
        if(res1>=t&&res2>=t){
            return c1+c2;
        }
        if(i>=bo.length){
            return Integer.MAX_VALUE;
        }
        if(res1>res2){
            if(dp.containsKey(res1)){
               if(dp.get(res1)[res2]!=-1) return dp.get(res1)[res2];
            }
        }else{
            if(dp.containsKey(res2)){
                if(dp.get(res2)[res1]!=-1) return dp.get(res2)[res1];
             }
        }
        int b1=res1 < t ? rec(bo,i+1,t,res1+bo[i],res2,c1+1,c2,dp) : Integer.MAX_VALUE;
        int b2=res2 < t ? rec(bo,i+1,t,res1,res2+bo[i],c1,c2+1,dp) : Integer.MAX_VALUE;
        int val=Math.min(b1,b2);
        if(res1>res2){
            if(!dp.containsKey(res1)){
              int[] arr=new int[4001];
              Arrays.fill(arr,-1);
              dp.put(res1,arr);
            }
            dp.get(res1)[res2]=val;
        }else{
            if(!dp.containsKey(res2)){
                int[] arr=new int[4001];
                Arrays.fill(arr,-1);
                dp.put(res2,arr);
            }
            dp.get(res2)[res1]=val;
        }
        return val;
    }
    }


    

