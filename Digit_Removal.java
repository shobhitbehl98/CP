import java.io.*;
import java.util.*;
// class CodeChef{
public class Digit_Removal {

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
            String[] n=f.nextLine().split(" ");
            long a=Long.parseLong(n[0]);
            int b=Integer.parseInt(n[1]);
            ArrayList<Integer> l=new ArrayList<>();
            int j=n[0].length()-1;
            for(int i=0;i<n[0].length();i++){
                if(n[0].charAt(i)-'0'==b){
                    l.add(j);
                }
                j--;
            }
            if(l.size()==0){
                sb.append(0+"\n");
            }else if(l.get(0)==0){
                sb.append(1+"\n");
            }else{
                if(b!=0){
                   int h=l.get(0);
                   long k=((b+1)*(long)Math.pow(10,h));
                   long m=Long.parseLong(n[0].substring(n[0].length()-h-1));
                   System.out.println(k+" "+m);
                   sb.append((k-m)+"\n");

                }else{
                    long ans=0;
                   for(int e=0;e<l.size();e++){
                    long k=((b+1)*(long)Math.pow(10,l.get(e)));
                    ans+=k;
                   }
                   sb.append(ans+"\n");
                }
            }
            
        }
        System.out.print(sb);
    }
         
    }
    


    

