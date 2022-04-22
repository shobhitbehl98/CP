import java.io.*;
import java.util.*;
class CodeChef{
// public class Fixed_number_of_Fixed_Points {

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
            int m=Integer.parseInt(s[0]);
            int n=Integer.parseInt(s[1]);
            if(n==m-1){
                sb.append(-1+"\n");
                continue;
            }
            int e=m-n;
            int i=0;
            int j=m-1;
            int x=1;
            int y=m;
            int r=0;
            int[] ans=new int[m];
            while(n>0){
              if(r%2==0){
                ans[i]=x;
                i++;
                x++;
              }else{
                ans[j]=y;
                j--;
                y--;
            }
              r++;
              n--;
            }
            if(e%2==0){
                while(i<ans.length&&ans[i]==0){
                    ans[i]=y;
                    y--;
                    i++;
                }
            }else{
                 ans[i]=y;
                 i++;
                 y--;
                 while(i<ans.length&&ans[i]==0){
                    ans[i]=x;
                    x++;
                    i++;
                }
            }

            for(int z=0;z<ans.length;z++){
                sb.append(ans[z]+" ");
            }
            sb.append("\n");
                 
         }
         System.out.println(sb);
    }
    }


    

