/*
Find the max range and min range, max range would be A+B+C-1 and min range would be arr[2]-arr[1]-arr[0]-1 after sorting the array and if value of m is between min and max then print yes else no.
*/

import java.io.*;
import java.util.*;
public class B_Combinatorics_Homework {

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
            String[] s=f.nextLine().split(" ");
            int[] arr={Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2])};
            Arrays.sort(arr);
            int max=arr[0]+arr[1]+arr[2]-3;
            int min=arr[2]-arr[1]-arr[0]-1;
            int m=Integer.parseInt(s[3]);
            if(m>=min&&m<=max){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
         }
         System.out.println(sb);
    }
    }


    

