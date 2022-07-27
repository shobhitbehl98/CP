/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;

public class Main {

    public static class Node{
        int val;
        ArrayList<Node> child;

        Node(int val,ArrayList<Node> child){
            this.val=val;
            this.child=child;
        }
    }

    public static void main(String[] args) {
        FastReader f = new FastReader();
        StringBuilder sb = new StringBuilder();
        int t = f.nextInt();
        max=0;
        while (t-- > 0) {
           int n=f.nextInt();
           HashMap<Integer,Node> hm=new HashMap<>();
           for(int i=1;i<=n;i++){
               ArrayList<Node> c=new ArrayList<>();
               hm.put(i,new Node(i,c));
           }
           boolean[] root=new boolean[n+1];
           int j=n-1;
           while(j-->0){
               int a=f.nextInt();
               int b=f.nextInt();
               hm.get(a).child.add(hm.get(b));
               root[b]=true;
           }
           int head=0;
           for(int i=1;i<=n;i++){
               if(!root[i]){
                   head=i;
                   break;
               }
           }
           PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
           for(int i=0;i<hm.get(head).child.size();i++){
               int ret=fn(hm.get(head).child.get(i));
               pq.add(ret);
           }

           if(pq.size()>=2){
               int q1=pq.remove();
               int q2=pq.remove();
               max=Math.max(max,q1+q2+2);
           }
            sb.append(max+"\n");
            max=0;
            
        }
        System.out.println(sb);

    }

    public static int fn(Node h){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<h.child.size();i++){
            int ret=fn(h.child.get(i));
            pq.add(ret);
        }
         
        if(pq.size()>=2){
            int q1=pq.remove();
            int q2=pq.remove();
            max=Math.max(max,q1+q2+2);
            return q1+1;
        }else if(pq.size()==1){
            return pq.remove()+1;
        }
        
        return 0;
    }
    public static int max; 
    static final Random random = new Random();
    static final int mod = 1_000_000_007;

    static void ruffleSort(int[] a) {
        int n = a.length;// shuffle, then sort
        for (int i = 0; i < n; i++) {
            int oi = random.nextInt(n), temp = a[oi];
            a[oi] = a[i];
            a[i] = temp;
        }
        Arrays.sort(a);
    }

    static long add(long a, long b) {
        return (a + b) % mod;
    }

    static long sub(long a, long b) {
        return ((a - b) % mod + mod) % mod;
    }

    static long mul(long a, long b) {
        return (a * b) % mod;
    }

    static long exp(long base, long exp) {
        if (exp == 0)
            return 1;
        long half = exp(base, exp / 2);
        if (exp % 2 == 0)
            return mul(half, half);
        return mul(half, mul(half, base));
    }

    static long[] factorials = new long[2_000_001];
    static long[] invFactorials = new long[2_000_001];

    static void precompFacts() {
        factorials[0] = invFactorials[0] = 1;
        for (int i = 1; i < factorials.length; i++)
            factorials[i] = mul(factorials[i - 1], i);
        invFactorials[factorials.length - 1] = exp(factorials[factorials.length - 1], mod - 2);
        for (int i = invFactorials.length - 2; i >= 0; i--)
            invFactorials[i] = mul(invFactorials[i + 1], i + 1);
    }

    static long nCk(int n, int k) {
        return mul(factorials[n], mul(invFactorials[k], invFactorials[n - k]));
    }

    static void sort(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i : a)
            l.add(i);
        Collections.sort(l);
        for (int i = 0; i < a.length; i++)
            a[i] = l.get(i);
    }

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

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
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
}
