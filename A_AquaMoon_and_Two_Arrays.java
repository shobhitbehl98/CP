import java.io.*;
import java.util.*;
public class A_AquaMoon_and_Two_Arrays {

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
            int r=f.nextInt();
            String[] s=f.nextLine().split(" ");
            String[] b=f.nextLine().split(" ");
            
            ArrayList<Integer> ival=new ArrayList<>();
            ArrayList<Integer> jval=new ArrayList<>();
            int m=0;
            for(int i=0;i<r;i++){
             int k=Integer.parseInt(b[i])-Integer.parseInt(s[i]);
             m+=k;
             while(k!=0){
               if(k>0){
                   jval.add(i+1);
                   k--;
               }else if(k<0){
                   ival.add(i+1);
                   k++;
               }
             }
            }
            if(m!=0){
                sb.append(-1+"\n");
            }else{
                sb.append(ival.size()+"\n");
            for(int i=0;i<ival.size();i++){
                sb.append(ival.get(i)+" "+jval.get(i)+"\n");
            }
        }
           

            
         }
         System.out.println(sb);
    }
    }

