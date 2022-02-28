import java.util.*;
public class Rotten_Oranges {
    public static class Pair {
       int x;
       int y;
       int t; 
   
       Pair(int x, int y,int t) {
         this.x = x;
         this.y = y;
         this.t = t;  
       }
   
     }
   public static int orangesRotting(int[][] grid) {
       boolean[][] visited=new boolean[grid.length][grid[0].length];
       int ans=0;
       LinkedList<Pair> li=new LinkedList<>();
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
             if(grid[i][j]==2&&!visited[i][j]){
                 li.addLast(new Pair(i,j,0));
                 // int u=bfs(visited,grid,li);
                 // ans=Math.max(u,ans);
             }  
           }
        }
       int u=bfs(visited,grid,li);
       ans=Math.max(u,ans);
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]==1){
                   return -1;
               }
           }
       }
       
       return ans;
   }
   
   public static int bfs(boolean[][] visited,int[][] grid,LinkedList<Pair> li){
       
       int time=0;
       
       while(li.size()>0){
           int size=li.size();
           while(size-->0){
               Pair rem=li.removeFirst();
               if(visited[rem.x][rem.y]){
                   continue;
               }
               visited[rem.x][rem.y]=true;
               time=Math.max(time,rem.t);
               grid[rem.x][rem.y]=2;
               if(rem.x-1>=0&&!visited[rem.x-1][rem.y]&&grid[rem.x-1][rem.y]==1){
                   li.addLast(new Pair(rem.x-1,rem.y,rem.t+1));
               }
               if(rem.x+1<grid.length&&!visited[rem.x+1][rem.y]&&grid[rem.x+1][rem.y]==1){
                   li.addLast(new Pair(rem.x+1,rem.y,rem.t+1));
               }
               if(rem.y-1>=0&&!visited[rem.x][rem.y-1]&&grid[rem.x][rem.y-1]==1){
                   li.addLast(new Pair(rem.x,rem.y-1,rem.t+1));
               }
               if(rem.y+1<grid[0].length&&!visited[rem.x][rem.y+1]&&grid[rem.x][rem.y+1]==1){
                   li.addLast(new Pair(rem.x,rem.y+1,rem.t+1));
               }
           }
       }
       
       return time;
   }
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int r=s.nextInt();
       int c=s.nextInt();

       int[][] grid=new int[r][c];
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
               grid[i][j]=s.nextInt();
           }
       }
       System.out.println(orangesRotting(grid));
       s.close();

   }
}