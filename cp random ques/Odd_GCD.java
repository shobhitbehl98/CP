import java.io.*;
import java.util.*;
// class CodeChef{
public class Odd_GCD {

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
            int k=f.nextInt();
            String[] s=f.nextLine().split(" ");
            int[] arr=new int[k];
            boolean r=false;
            int max=0;
            for(int i=0;i<arr.length;i++){
                arr[i]=Integer.parseInt(s[i]);
                if(arr[i]%2==1){
                    sb.append(0+"\n");
                    r=true;
                    break;
                }
                max=Math.max(max,arr[i]);
            }
            if(r){
                continue;
            }

            int[] sie=new int[max+1];
            Arrays.fill(sie, 1);
            int h=3;
            while(h<sie.length){
                int g=h;
                int y=2;
            while(g*y<sie.length){
                sie[g*y]=h;
                System.out.println(t+" "+g*y+" "+h+" "+y+" "+sie[g*y]);
               y+=2;
            }
            h+=2;
           }
        int ans=arr.length;
        for(int i=0;i<arr.length;i++){
            if(sie[arr[i]]==1){
                int e=2;
                int u=1;
                while(e<arr[i]){
                    e*=2;
                    u++;
                }
                ans=Math.min(u,ans);
            }else{
                ans=Math.min((arr[i]/(sie[arr[i]]*2)),ans);
            }
        }

        sb.append(ans+"\n");
         }
         System.out.println(sb);
    }
    }


    

