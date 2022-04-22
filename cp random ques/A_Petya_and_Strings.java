import java.io.*;
import java.util.*;
public class A_Petya_and_Strings {

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
         String a=f.nextLine();        
         String b=f.nextLine();
         int ans=0;
         for(int i=0;i<a.length();i++){
             char c=a.charAt(i);
             char d=b.charAt(i);
             int x=0,y=0;
             if(c-'A'>=0&&c-'a'<0){
                 x=c-'A';
             }else{
                 x=c-'a';
             }
             if(d-'A'>=0&&d-'a'<0){
                 y=d-'A'; 
             }else{
                 y=d-'a';
             }
             if(x>y){
                 ans=1;
                 break;
             }else if(x<y){
                 ans=-1;
                 break;
             }

         }
         
         System.out.println(ans);
    }
    }
    


    

