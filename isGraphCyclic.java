import java.io.*;
import java.util.*;

public class isGraphCyclic {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
  static class Pair {
      int val;
      String path;

      Pair(int val, String path) {
         this.val = val;
         this.path = path;
      }
  }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      boolean[] visited=new boolean[vtces];
      for(int i=0;i<vtces;i++){
          if(visited[i]==false){
             boolean ans=cyclic(graph,i,visited);
             if(ans){
                 System.out.println(true);
                 return;
             }
          }
      }
   
    System.out.println(false);
   }
   
   public static boolean cyclic(ArrayList<Edge>[] graph,int v,boolean[] visited){
      ArrayDeque<Pair> qu=new ArrayDeque<>();
      qu.add(new Pair(v,v+""));
          while(qu.size()>0){
          Pair p=qu.removeFirst();
          if(visited[p.val]==false){
              visited[p.val]=true;
              for(int i=0;i<graph[p.val].size();i++){
                  Edge ce=graph[p.val].get(i);
                  if(visited[ce.nbr]==false){
                      qu.add(new Pair(ce.nbr,p.path+ce.nbr));
                  }
              }
          }else{
              return true;
          }
      }
      
      return false;
   }
}