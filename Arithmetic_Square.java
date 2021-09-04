import java.io.*;
import java.util.*;
public class Arithmetic_Square {

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
         long p=1;
         while(t-->0){
            
            String[] a=f.nextLine().split(" ");
            String[] b=f.nextLine().split(" ");
            String[] c=f.nextLine().split(" ");

            HashMap<Long,Long> hm=new HashMap<>();
            long a0=Long.parseLong(a[0]);
            Long a1=Long.parseLong(a[1]);
            Long a2=Long.parseLong(a[2]);
            Long b0=Long.parseLong(b[0]);
            Long b2=Long.parseLong(b[1]);
            Long c0=Long.parseLong(c[0]);
            Long c1=Long.parseLong(c[1]);
            Long c2=Long.parseLong(c[2]);

            // System.out.println((c1-a1)%2+" -1- "+((c1+a1)/2));
            // System.out.println((c0-a2)%2+" -2- "+((c0+a2)/2));
            // System.out.println((c2-a0)%2+" -3- "+((c2+a0)/2));
            // System.out.println((b0-b2)%2+" -4- "+((b0+b2)/2));
            if((c1-a1)%2==0){
                if(hm.containsKey(((c1+a1)/2))){
                    hm.put(((c1+a1)/2),hm.get(((c1+a1)/2))+1);
                }else{
                    hm.put((c1+a1)/2,(long)1);
                }
            }
            if((c2-a0)%2==0){
                if(hm.containsKey(((c2+a0)/2))){
                    hm.put(((c2+a0)/2),hm.get(((c2+a0)/2))+1);
                }else{
                    hm.put(((c2+a0)/2),(long)1);
                }
            }
            if((c0-a2)%2==0){
                if(hm.containsKey(((c0+a2)/2))){
                    hm.put(((c0+a2)/2),hm.get(((c0+a2)/2))+1);
                }else{
                    hm.put(((c0+a2)/2),(long)1);
                }
            }
            if((b0-b2)%2==0){
                if(hm.containsKey(((b0+b2)/2))){
                    hm.put(((b0+b2)/2),hm.get(((b0+b2)/2))+1);
                }else{
                    hm.put(((b0+b2)/2),(long)1);
                }
            }
            
            long max=0;
            for(Long i:hm.keySet()){
               max=Math.max(hm.get(i),max);
            }
            if((a2+c2)/2==b2){
                max++;
            }
            if((a0+c0)/2==b0){
                max++;
            }
            if((a0+a2)/2==a1){
                max++;
            }
            if((c0+c2)/2==c1){
                max++;
            }
            sb.append("Case #"+p+": "+max+"\n");
            p++;

         }
         System.out.println(sb);
    }
    }

