/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;
public class A_Not_Shading {

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
            int m=f.nextInt();
            int a=f.nextInt();
            int b=f.nextInt();

            a--;
            b--;

            char[][] arr=new char [n][m];
            boolean z=false;
            for(int i=0;i<n;i++){
                arr[i]=f.nextLine().toCharArray();
                for(int j=0;j<arr[i].length;j++){
                    if(arr[i][j]=='B'){
                       z=true;
                    }
                }  
             }
             if(!z){
                 sb.append(-1+"\n");
             }else if(arr[a][b]=='B'){
                 sb.append(0+"\n");
             }else{
                 boolean found=false;
             for(int i=0;i<arr[a].length;i++){
                 if(arr[a][i]=='B'){
                     sb.append(1+"\n");
                     found=true;
                     break;
                 }
             }
             if(!found){
             for(int j=0;j<arr.length;j++){
                 if(arr[j][b]=='B'){
                    sb.append(1+"\n");
                     found=true;
                     break; 
                 }
             }
            }
             if(!found){
               sb.append(2+"\n");
             }

            }
                 
         }
         System.out.println(sb);
    }
    }


    

