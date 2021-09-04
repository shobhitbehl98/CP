import java.io.*;
import java.util.*;
public class C_Challenging_Cliffs {

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
    
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//--------------------GENERIC TREE--------------------------------------------------------------------------------------------------------
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
// private static class Node {
//     int data;
//     ArrayList<Node> children = new ArrayList<>();
//   }

//   public static Node construct(int[] arr) {
//     Node root = null;

//     Stack<Node> st = new Stack<>();
//     for (int i = 0; i < arr.length; i++) {
//       if (arr[i] == -1) {
//         st.pop();
//       } else {
//         Node t = new Node();
//         t.data = arr[i];

//         if (st.size() > 0) {
//           st.peek().children.add(t);
//         } else {
//           root = t;
//         }

//         st.push(t);
//       }
//     }

//     return root;
//   }

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//--------------------GRAPH---------------------------------------------------------------------------
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
// static class Edge {
//     int src;
//     int nbr;
//     int wt;

//     Edge(int src, int nbr, int wt) {
//        this.src = src;
//        this.nbr = nbr;
//        this.wt = wt;
//     }
//  }

// int vtces = Integer.parseInt(br.readLine());
//       ArrayList<Edge>[] graph = new ArrayList[vtces];
//       for (int i = 0; i < vtces; i++) {
    //          graph[i] = new ArrayList<>();
    //       }
    
    //       int edges = Integer.parseInt(br.readLine());
    //       for (int i = 0; i < edges; i++) {
        //          String[] parts = br.readLine().split(" ");
        //          int v1 = Integer.parseInt(parts[0]);
        //          int v2 = Integer.parseInt(parts[1]);
        //          int wt = Integer.parseInt(parts[2]);
        //          graph[v1].add(new Edge(v1, v2, wt));
        //          graph[v2].add(new Edge(v2, v1, wt));
        //       }
        
        
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//--------------------BINARY TREE---------------------------------------------------------------------------
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
// public static class Node {
//     int data;
//     Node left;
//     Node right;

//     Node(int data, Node left, Node right) {
//       this.data = data;
//       this.left = left;
//       this.right = right;
//     }
//   }

//   public static class Pair {
//     Node node;
//     int state;

//     Pair(Node node, int state) {
//       this.node = node;
//       this.state = state;
//     }
//   }

//   public static Node construct(Integer[] arr) {
//     Node root = new Node(arr[0], null, null);
//     Pair rtp = new Pair(root, 1);

//     Stack<Pair> st = new Stack<>();
//     st.push(rtp);

//     int idx = 0;
//     while (st.size() > 0) {
//       Pair top = st.peek();
//       if (top.state == 1) {
//         idx++;
//         if (arr[idx] != null) {
//           top.node.left = new Node(arr[idx], null, null);
//           Pair lp = new Pair(top.node.left, 1);
//           st.push(lp);
//         } else {
//           top.node.left = null;
//         }

//         top.state++;
//       } else if (top.state == 2) {
//         idx++;
//         if (arr[idx] != null) {
//           top.node.right = new Node(arr[idx], null, null);
//           Pair rp = new Pair(top.node.right, 1);
//           st.push(rp);
//         } else {
//           top.node.right = null;
//         }

//         top.state++;
//       } else {
//         st.pop();
//       }
//     }

//     return root;
//   }
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
public static class pair implements Comparable<pair>{
    long val=0;
    int st=0;
    int end=0;

    pair(long val,int st,int end){
        this.val=val;
        this.st=st;
        this.end=end;
    }

    public int compareTo(pair o){
        if(this.val!=o.val){
        return (int)(this.val-o.val);
        }else{
        return this.st-o.st;
        }
    }
}    
public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t=f.nextInt();
         while(t-->0){
             int n=f.nextInt();
            String[] s=f.nextLine().split(" ");
            Long[] arr=new Long[n];
            for(int i=0;i<n;i++){
                arr[i]=Long.parseLong(s[i]);
            }
            Arrays.sort(arr);
            pair[] diff=new pair[n-1];
            for(int i=0;i<diff.length;i++){
             diff[i]=new pair((arr[i+1]-arr[i]),i,i+1);                 
            }
            Arrays.sort(diff);
            long[] ans=new long[n];
            ans[0]=arr[diff[0].st];
            ans[ans.length-1]=arr[diff[0].end];
            arr[diff[0].st]=null;
            arr[diff[0].end]=null;
            int m=1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=null&&arr[i]>=ans[0]){
                   ans[m]=arr[i];
                   m++;
                   arr[i]=null;
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=null){
                   ans[m]=arr[i];
                   m++;
                }
            }
            for(int i=0;i<ans.length;i++){
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
         }
         System.out.println(sb);

    }
}
