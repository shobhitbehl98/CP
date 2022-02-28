/* Author shobhit_behl */

import java.io.*;
import java.util.*;
public class implement_graphs {
    public static class Pair {
           int e;
           int wt;
       
           Pair(int e, int wt) {
             this.e = e;
             this.wt = wt;
           }
       
         }
     
    public static class Graph{
        public static LinkedList<Pair>[] adj;
        public Graph(int v){
            adj=new LinkedList[v];
            for(int i=0;i<v;i++){
                adj[i]=new LinkedList<>();
            }
        }

        void addEdge(int s,int e,int w){
              Pair st=new Pair(e,w);
              adj[s].add(st);
              Pair en=new Pair(s,w);
              adj[e].add(en);
        }
    }
    public static void main(String[] args){
         Scanner f=new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         int v=f.nextInt();
         int e=f.nextInt();
         Graph g=new Graph(v);
         for(int i=0;i<e;i++){
             int st=f.nextInt();
             int en=f.nextInt();
             int wt=f.nextInt();
             g.addEdge(st,en,wt);
         }
        

         for(int i=0;i<v;i++){
             Iterator<Pair> it=g.adj[i].iterator();
             while(it.hasNext()){
                 Pair r=it.next();
                 System.out.println(i+" "+r.e);
             }

         }
    }
    }


    

