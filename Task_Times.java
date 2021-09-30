import java.io.*;
import java.util.*;
class CodeChef{
// public class kTask_Times {

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
     public static class Pair implements Comparable<Pair> {
            int b;
            int k;
        
            Pair(int b, int k) {
              this.b = b;
              this.k = k;
            }

            public int compareTo(Pair o){
                return this.k-o.k;
            }
        
          }
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
            int n=f.nextInt();
            int m=f.nextInt();
            int time=f.nextInt();
            String[] c=f.nextLine().split(" ");
            String[] r=f.nextLine().split(" ");
            PriorityQueue<Pair> pq=new PriorityQueue<>();
            Queue<Pair> qu=new LinkedList<>();
            for(int i=0;i<c.length;i++){
                pq.add(new Pair(Integer.parseInt(c[i]),Integer.parseInt(r[i])));
            }
            HashMap<Integer,Integer> hs=new HashMap<>();
            while(pq.size()>0&&pq.peek().k<=time){
                Pair x=pq.poll();
                if(!hs.containsKey(x.b)){
                    if(qu.size()==0||(qu.size()>0&&x.k==qu.peek().k)){
                    hs.put(x.b,1);
                    time-=x.k;
                    }else{
                        while(qu.size()>0&&qu.peek().k<=time){
                            Pair q=qu.remove();
                           hs.put(q.b,hs.get(q.b)+1);
                           time-=q.k;
                        }
                    }
                }else{
                    qu.add(x);
                }
                    
            }

            while(qu.size()>0&&qu.peek().k<=time){
                Pair q=qu.remove();
                hs.put(q.b,hs.get(q.b)+1);
                time-=q.k;
            }
            double ans=0;
            for(int d:hs.keySet()){
                double z=(1.0*hs.get(d))/2;
                ans+=Math.ceil(z);
            }
            sb.append((int)ans+"\n");
         }
         System.out.println(sb);
    }
    }


    

