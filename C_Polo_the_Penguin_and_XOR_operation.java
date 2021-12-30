import java.io.*;
import java.util.*;
public class C_Polo_the_Penguin_and_XOR_operation {

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
         int n = f.nextInt();
         int y=0;
         while((int)(Math.pow(2,y)-1)<n){
             y++;
            }
            int h=(int)(Math.pow(2,y)-1);
            String x="";
            int j=n;
         int ans=0;
         HashSet<Integer> hs=new HashSet<>();
         while(j>=1){
             if(h-j<=n&&!hs.contains(h-j)){
               x=" "+(h-j)+x;
               ans+=j^(h-j);
               hs.add(h-j);
               j--;
             }else{
                 if(hs.contains(h-j)){
                    x=" "+(j)+x;
                    ans+=j^(j);
                    hs.add(j);
                    j--;
                 }
                 y--;
                 h=(int)(Math.pow(2,y)-1);
             }
         }
         x=0+x;
         System.out.println(ans);
         System.out.println(x);
         
    }
    }


    

