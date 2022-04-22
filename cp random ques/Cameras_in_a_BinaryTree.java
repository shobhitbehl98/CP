import java.io.*;
import java.util.*;

public class Cameras_in_a_BinaryTree {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(int[] arr) {
        Node root = new Node(arr[0], null, null);
        int idx = 0;
        Pair x = new Pair(root, 1);
        Stack<Pair> st = new Stack<>();
        st.push(x);
        while (st.size() > 0) {
            Pair s = st.peek();
            if (s.state == 1) {
                idx++;
                if (arr[idx] != -1) {
                    Node lf = new Node(arr[idx], null, null);
                    s.node.left = lf;
                    Pair lp = new Pair(lf, 1);
                    st.push(lp);
                } else {
                    s.node.left = null;
                }
                s.state++;

            } else if (s.state == 2) {
                idx++;
                if (arr[idx] != -1) {
                    Node rf = new Node(arr[idx], null, null);
                    s.node.right = rf;
                    Pair rp = new Pair(rf, 1);
                    st.push(rp);
                } else {
                    s.node.right = null;
                }
                s.state++;
            } else {
                st.pop();
            }
        }
        return root;
    }

    public static int cameras=0;
    public static int findCameras(Node temp){
        if(temp==null){
            return 0;
        }
        int left=findCameras(temp.left);
        int right=findCameras(temp.right);
        
        if(left==2||right==2){
            cameras++;
            return 1;
        }else if(left==1||right==1){
            return 0;
        }

        return 2;

    }

    public static void main(String[] args) {
        FastReader f = new FastReader();
        StringBuilder sb = new StringBuilder();
        int n = f.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = f.nextInt();
        }
        Node root = construct(arr);
        int ret=findCameras(root);
        if(ret==2){
          cameras++;
        }
        System.out.println(cameras);
    }
}
