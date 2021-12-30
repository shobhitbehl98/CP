import java.io.*;
import java.util.*;
public class B_Mirror_in_the_String {

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
         StringBuilder l=new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
             StringBuilder sb=new StringBuilder();
             int len=f.nextInt();
             String s=f.nextLine();
             String g="";
             sb.append(s.charAt(0));
             boolean c=false;
             boolean go=false;
            for(int i=1;i<len;i++){
                int v=s.charAt(i)-'a';
                int u=s.charAt(i-1)-'a';
                if(u<v){
                   String x=sb.toString();
                   String r=sb.reverse().toString();
                   g=x+r;
                   c=true;
                   break;
                }else{
                    if(u>v){
                       go=true;
                    }
                    if(go){
                    sb.append(s.charAt(i));
                    }else{
                        break;
                    }
                }
               
            }
            if(!c){
                String x=sb.toString();
                String r=sb.reverse().toString();
                g=x+r; 
            }
            l.append(g+"\n");
            
                 
         }
         System.out.println(l);
    }
    }


     

