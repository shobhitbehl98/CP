import java.io.*;
import java.util.*;
public class Binary_String_on_Steroids {

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
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
             int g=f.nextInt();
             String[] s=f.nextLine().split(" ");
             int ones=0;
             int zeroes=0;
             for(int i=0;i<s.length;i++){
                  if(Integer.parseInt(s[i])==1){
                      ones++;
                  }else{
                      zeroes++;
                  }
             }
             sb.append(ones+"\n");
             sb.append(zeroes+"\n");
             if(ones>zeroes){
                 sb.append(zeroes+"\n");
             }else if(zeroes>ones){
                 sb.append(ones-1+"\n");
             }else{
                 sb.append(((ones+zeroes)/2)+1+"\n");
             }
         }
         System.out.println(sb);
    }
}
