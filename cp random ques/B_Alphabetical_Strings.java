import java.io.*;
import java.util.*;
public class B_Alphabetical_Strings {

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
            boolean is=true;
            String s=f.nextLine();
            HashMap<Character,Integer> hm=new HashMap<>();
            for(int i=1;i<=s.length();i++){
                int r=i+96;
                char d=(char)r;
                hm.put(d,1);
            }
            for(int i=0;i<s.length();i++){
                if(hm.containsKey(s.charAt(i))==false||check(s,i,hm)==false){
                    is=false;
                    sb.append("NO\n");
                    break;
                }else{
                    hm.remove(s.charAt(i));
                }
            }

            if(is){
                sb.append("YES\n");
            }

         }
         System.out.println(sb);
    }

    public static boolean check(String s,int i,HashMap<Character,Integer> hm){
        int ho=s.charAt(i);
        if(s.length()==1||ho==97){
            return true;
        }
        if(i==0){
            int h=s.charAt(i+1);
            if(h>ho){
                return false;
            }
        }else if(i==s.length()-1){
            int h=s.charAt(i-1);
            if(h>ho){
                return false;
            }
            
        }else{
            int h=s.charAt(i-1);
            int g=s.charAt(i+1);
            if((h>ho+1&&g>ho+1)||(h<ho+1&&g<ho+1)){
                return false;
            }
            
        }
        return true;
    }
    }

