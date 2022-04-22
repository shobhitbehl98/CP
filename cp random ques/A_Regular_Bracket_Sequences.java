/*
if n=4
then output would be 
(((()))) --> 0 4
()((())) --> 1 3
(())(()) --> 2 2
((()))() --> 3 1

as we can observe brackets on the left increase from 0 1 2 3 and brackets on the right decrease from 4 3 2 1
so we will have to use a for loop which will iterate from 0 to 3 -- int i=0;i<4;i++

and inside that for loop we will have to use another for loop for left brackets'(' and second for ')' left brackets int x=0;x<i(i will go from 0 to 2 as loop i will go from 0 to 3 remember that).

the third loop will be used for from i=0;i<n-i; for'(' and fourth will run i=0;i<n-i; for ')'

dry run the solution to get complete clarity.

Time Complexity : O(N^2);  

*/
import java.io.*;
import java.util.*;
public class A_Regular_Bracket_Sequences {

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
           String st="";
           for(int i=0;i<r;i++){
              for(int x=0;x<i;x++){
                  st+="(";
              }
              for(int x=0;x<i;x++){
                  st+=")";
              }
              for(int x=0;x<r-i;x++){
                  st+="(";
              }
              for(int x=0;x<r-i;x++){
                  st+=")";
              }
              sb.append(st+"\n");
              st="";
           }
         }
         System.out.println(sb);
    }
        
    }



    

