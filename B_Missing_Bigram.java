import java.io.*;
import java.util.*;
public class B_Missing_Bigram {

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
            String[] s=f.nextLine().split(" ");
            boolean found=false;
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<s.length;i++){
                if(i==s.length-1){
                   ans.append(s[i]);
                }else{
                    ans.append(s[i].charAt(0));
                    if(s[i].charAt(1)!=s[i+1].charAt(0)){
                       found=true;
                       ans.append(s[i].charAt(1)); 
                    }
                }
            }
            if(!found){
                ans.append(s[s.length-1].charAt(1));
            }
             sb.append(ans.toString()+"\n");    
         }
         System.out.println(sb);
    }
    }


    

