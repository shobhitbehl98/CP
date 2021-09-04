import java.io.*;
import java.util.*;
// class CodeChef{
public class Minimize_Digit_Sum {

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
            int n=Integer.parseInt(s[0]);
            int l=Integer.parseInt(s[1]);
            int r=Integer.parseInt(s[2]);
            int sum=Integer.MAX_VALUE;
            int ans=-1;
            if(n<l){
                sb.append(n+"\n");
                continue;
            }else if(n>=l&&n<=r){
                sb.append(1+"\n");
                continue;
            }
            for(int i=l;i<=r;i++){
                int fsum=0;
                int m=n;
                while(m>Math.pow(i,1)){
                 if(fsum>sum){
                     break;
                 }   
                int j=1;
                while((int)Math.pow(i,j)<=m){
                    j++;
                }
                int k=(int)Math.pow(i,j-1);
                // System.out.println(m+"--"+j+" "+k);
                fsum+=m/k;
                m-=k;
            }
            if(fsum<sum){
              sum=fsum;
              ans=i;
              System.out.println(sum+" "+ans);
            }
            
            }
            sb.append(ans+"\n");
         }
         System.out.println(sb);
    }
    }


    

