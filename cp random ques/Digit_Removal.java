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
            ArrayList<Integ
            int b=Integer.parseInt(n[1]);
            int z=-1;
            for(int i=0;i<n[0].length();i++){
                if(n[0].charAt(i)-'0'==b){
                    z=i;
                    break;
                }
            }
            
            if(z==-1){
                sb.append(0+"\n");
            }else{
              ArrayList<Integer> li=new ArrayList<>();
              if(b==0){
                 for(int i=arr.length;i>=0;i--){
                     if(arr[i]==||arr[i]==1){
                         li.add(0,1-arr[i])
                     }
                 }
              } 
              
             }
        
    }
    System.out.print(sb);
}

}



    

