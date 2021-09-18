import java.io.*;
import java.util.*;
public class A_Panoramix_s_Prediction {

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
         String[] s=f.nextLine().split(" ");
         int x=Integer.parseInt(s[0]);
         int y=Integer.parseInt(s[1]);
         boolean[] p=new boolean[51];
         for(int i=2;i<p.length;i++){
             if(p[i]==true){
                 continue;
             }
             boolean isp=true;
             for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isp=false;
                }
             }
             if(isp){
                 int z=2;
                 while(z*i<=50){
                     p[z*i]=true;
                     z++;
                 }
             }
         }
         
         int k=x+1;
         while(k<=50&&p[k]){
             k++;
         }
         if(k==y){
             System.out.println("YES");
         }else{
             System.out.println("NO");
         }
    }
    }


    

