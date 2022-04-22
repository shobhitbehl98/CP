import java.io.*;
import java.util.*;
public class shortest_bridge {

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
     public static class Pair {
            int i;
            int j;
            int st;
        
            Pair(int i, int j,int st) {
              this.i = i;
              this.j = j;
              this.st = st;
            }
        
          }
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         int[][] arr=new int[t][t];
         for(int i=0;i<t;i++){
           for(int j=0;j<t;j++){
             arr[i][j]=f.nextInt(); 
             //  System.out.print(arr[i][j]+" ");     
            }
            //  System.out.println();
          }
          boolean[][] vis=new boolean[t][t];
        LinkedList<Pair> qu=new LinkedList<>();
        boolean x=false;
        for(int i=0;i<t&&!x;i++){
            for(int j=0;j<t&&!x;j++){
                  if(arr[i][j]==1){
                      getall(i,j,qu,arr,vis);
                      x=true;
                  }      
            }
         }
         while(qu.size()>0){
             Pair r=qu.removeFirst();
             vis[r.i][r.j]=true;
             if(arr[r.i][r.j]==1&&r.st>0){
                 System.out.println(r.st-1);
                 break;
             }
             
            if(r.i-1>=0 && vis[r.i-1][r.j]==false){
              qu.addLast(new Pair(r.i-1,r.j,r.st+1));
            }
            if(r.j+1<arr[0].length&& vis[r.i][r.j+1]==false){
              qu.addLast(new Pair(r.i,r.j+1,r.st+1));
            }
            if(r.i+1<arr.length&& vis[r.i+1][r.j]==false){
              qu.addLast(new Pair(r.i+1,r.j,r.st+1));
            }
            if(r.j-1>=0 && vis[r.i][r.j-1]==false){
              qu.addLast(new Pair(r.i,r.j-1,r.st+1));
            }
             
         }

    }

    public static void getall(int i, int j, LinkedList<Pair> qu,int[][] arr,boolean[][] vis){
        qu.addLast(new Pair(i,j,0));
        vis[i][j]=true;
        if(i-1>=0&&arr[i-1][j]==1&&vis[i-1][j]==false){
          getall(i-1,j,qu,arr,vis);
        }
        if(j+1<arr[0].length&&arr[i][j+1]==1&&vis[i][j+1]==false){
          getall(i,j+1,qu,arr,vis);
        }
        if(i+1<arr.length&&arr[i+1][j]==1&&vis[i+1][j]==false){
          getall(i+1,j,qu,arr,vis);
        }
        if(j-1>=0&&arr[i][j-1]==1&&vis[i][j-1]==false){
          getall(i,j-1,qu,arr,vis);
        }
    }
    }


    

