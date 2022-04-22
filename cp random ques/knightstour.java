/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class knightstour {

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
         int n = f.nextInt();
         int m = f.nextInt();
         int[][] arr=new int[n][m];
         knights(arr,0,0,1);
    }

    public static void knights(int[][] arr,int i,int j,int c){
        if(i<0||i>=arr.length||j<0||j>=arr[0].length||arr[i][j]!=0){
            return;
        }
        arr[i][j]=c;
        if(c==((arr.length*arr[0].length)-1)){
            for(int m=0;m<arr.length;m++){
                for(int n=0;n<arr[0].length;n++){
                      System.out.print(arr[m][n]+" ");      
                }
                System.out.println();
             } 
             System.out.println();
            return;
        }
        knights(arr, i-2, j+1, c+1);
        knights(arr, i-1, j+2, c+1);
        knights(arr, i+1, j+2, c+1);
        knights(arr, i+2, j+1, c+1);
        knights(arr, i+2, j-1, c+1);
        knights(arr, i+1, j-2, c+1);
        knights(arr, i-1, j-2, c+1);
        knights(arr, i-2, j-2, c+1);
        arr[i][j]=0;
    }

    public static void display(int[][] arr){
               
    }
    }


    

