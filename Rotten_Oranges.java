import java.io.*;
import java.util.*;
public class Rotten_Oranges {

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
        int t;
    
        Pair(int i, int j,int t) {
          this.i = i;
          this.j = j;
          this.t = t;
        }
    
      }
    
    public static void main(String[] args){
         FastReader f=new FastReader();
         int v=f.nextInt();
         int e=f.nextInt();

         LinkedList<Pair> qu=new LinkedList<>();
         int[][] arr=new int[v][e];
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[0].length;j++){
                 arr[i][j]=f.nextInt();
                 if(arr[i][j]==2){
                     qu.addLast(new Pair(i,j,0));
                 }
             }
         }
         int time=0;
         while(qu.size()>0){
             Pair r=qu.removeFirst();
             time=Math.max(time,r.t);
             if(r.i+1<arr.length&&arr[r.i+1][r.j]==1){
                 arr[r.i+1][r.j]++;
                 qu.add(new Pair(r.i+1,r.j,r.t+1));
             }
             if(r.i-1>=0&&arr[r.i-1][r.j]==1){
                 arr[r.i-1][r.j]++;
                 qu.add(new Pair(r.i-1,r.j,r.t+1));
             }
             if(r.j+1<arr[0].length&&arr[r.i][r.j+1]==1){
                 arr[r.i][r.j+1]++;
                 qu.add(new Pair(r.i,r.j+1,r.t+1));
             }
             if(r.j-1>=0&&arr[r.i][r.j-1]==1){
                 arr[r.i][r.j-1]++;
                 qu.add(new Pair(r.i,r.j-1,r.t+1));
             }
         }
         int ans=0;
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[0].length;j++){
                 if(arr[i][j]==1){
                   ans=-1;
                   break;  
                 }
             }
        }
        if(ans!=-1){
            ans=time;
        }
        System.out.println(ans);
    }
    }


    

