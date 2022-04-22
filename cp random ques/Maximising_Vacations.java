/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
// class CodeChef{
public class Maximising_Vacations {

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
            int x=f.nextInt();
            char[] arr=f.nextLine().toCharArray();
            int[] ab=new int[n-x+1];
            int c=0;
            for(int i=0;i<x;i++){
               if(arr[i]=='1'){
                   c++;
               }
            }
            ab[0]=c;
            int h=0;
            int j=1;
            int[] tr=new int[ab.length];
            if(ab[0]==0){
                tr[0]=1;
            }
            for(int i=x;i<arr.length;i++){
               if(arr[h]=='1'){
                   c--;
               }
               if(arr[i]=='1'){
                   c++;
               }
               ab[j]=c;
               if(ab[j]==0){
                   if(j-x>=0){
                       tr[j]=tr[j-x]+1;
                   }else{
                       tr[j]=1;
                   }
               }else{
                   tr[j]=tr[j-1];
               }
               j++;
               h++;
            }
            int ans=tr[tr.length-1];
            for(int i=tr.length-1;i>=0;i--){
                if(ab[i]==1){
                    if(i-x>=0){
                        if(tr[i-x]==tr[i]){
                            ans++;
                            break;
                        }
                    }else{
                        ans++;
                        break;
                    }
                }
            }
            sb.append(ans+"\n");

            // for(int val:ab){
            //   System.out.print(val+" ");
            // }
            // System.out.println();
            // for(int val:tr){
            //   System.out.print(val+" ");
            // }
            // System.out.println();
            // System.out.println();
                 
         }
         System.out.println(sb);
    }
    }


    

