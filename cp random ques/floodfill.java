/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class floodfill {

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
         int n=f.nextInt();
         int m=f.nextInt();
         int x=f.nextInt();
         int y=f.nextInt();
        //  System.out.println(n+" "+m+" "+x+" "+y);
         boolean[][] visited=new boolean[n][m];
         getp(0,0,x,y,n-1,m-1,visited,"");
    }

    public static void getp(int i,int j,int x,int y,int n,int m,boolean[][] visited,String ans){
        if(i==x && j==y){
            System.out.println(ans);
            return;
        }
        visited[i][j]=true;
        if(i-1>=0&&!visited[i-1][j]){
             getp(i-1,j,x,y,n,m,visited,ans+"U ");
        }
        if(j+1<=m&&!visited[i][j+1]){
             getp(i,j+1,x,y,n,m,visited,ans+"R ");
        }
        if(i+1<=n&&!visited[i+1][j]){
             getp(i+1,j,x,y,n,m,visited,ans+"D ");
        }
        if(j-1>=0&&!visited[i][j-1]){
             getp(i,j-1,x,y,n,m,visited,ans+"L ");
        }
        visited[i][j]=false;
    }
    }


    

