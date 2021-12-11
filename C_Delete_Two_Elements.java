/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class C_Delete_Two_Elements {

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
            int sum=0;
            for(int i=0;i<arr.length;i++){
                arr[i]=f.nextInt();
                sum+=arr[i];
            }
            double h=(1.0*sum/arr.length)*2;
            Arrays.sort(arr);
            int i=0;
            int j=arr.length-1;
            int c=0;
            while(i<j){
                double g=(1.0*(arr[i]+arr[j]));

             if(g==h){
                 c++;
                 int z=j-1;
                 while(i<z&&arr[z]==arr[j]){
                     c++;
                     z--;
                 }
                 int e=i+1;
                 while(e<j&&arr[e]==arr[i]){
                     c++;
                     e++;
                 }
                 i++;
                 j--;
             }else if(g<h){
                 i++;
             }else if(g>h){
                 j--;
             }

            }
            sb.append(c+"\n");
        }
        System.out.println(sb);
    }
    }


    

