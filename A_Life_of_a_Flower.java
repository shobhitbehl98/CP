import java.io.*;
import java.util.*;
public class A_Life_of_a_Flower {

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
            int[] arr=new int[n];
            int s=1;
            int rem=2;
            for(int i=0;i<n;i++){
                arr[i]=f.nextInt();
            }
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    rem--;
                    if(rem==0){
                        s=-1;
                        break;
                    }
                }else{
                    rem=2;
                    if(i>0&&arr[i-1]==1){
                        s+=5;
                    }else{
                        s++;;
                    }
                }
                
            }
            
            sb.append(s+"\n");
         }
         System.out.println(sb);
    }
    }


    

