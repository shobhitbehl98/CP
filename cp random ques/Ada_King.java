/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastReader f = new FastReader();
        StringBuilder sb = new StringBuilder();
        int t = f.nextInt();
        while (t-- > 0) {
           int r=f.nextInt()-1; 
           int c=f.nextInt()-1; 
           int k=f.nextInt();
           int[][] arr=new int[8][8];
           boolean[][] v=new boolean[8][8];
           dfs(r,c,arr,v,k);
           int ans=0; 
           for(int i=0;i<arr.length;i++){
               for(int j=0;j<arr[0].length;j++){
                //    System.out.print(arr[i][j]+" ");
                   if(arr[i][j]==1){
                      ans++;
                   }
               }
            //    System.out.println();
           }
           sb.append(ans+"\n"); 
        }
        System.out.println(sb);

    }
    public static void dfs(int i,int j,int[][] arr,boolean[][] v,int k){
        arr[i][j]=1;
        if(k==0){
            return;
        }
        v[i][j]=true;
        if(i+1<arr.length&&!v[i+1][j]){
            dfs(i+1,j,arr,v,k-1);
        }
        if(i-1>=0&&!v[i-1][j]){
            dfs(i-1,j,arr,v,k-1);
        }
        if(j+1<arr[0].length&&!v[i][j+1]){
            dfs(i,j+1,arr,v,k-1);
        }
        if(j-1>=0&&!v[i][j-1]){
            dfs(i,j-1,arr,v,k-1);
        }

        if(i+1<arr.length&&j+1<arr[0].length&&!v[i+1][j+1]){
            dfs(i+1,j+1,arr,v,k-1);
        }
        if(i+1<arr.length&&j-1>=0&&!v[i+1][j-1]){
            dfs(i+1,j-1,arr,v,k-1);
        }
        if(i-1>=0&&j+1<arr[0].length&&!v[i-1][j+1]){
            dfs(i-1,j+1,arr,v,k-1);
        }
        if(i-1>=0&&j-1>=0&&!v[i-1][j-1]){
            dfs(i-1,j-1,arr,v,k-1);
        }
        
        v[i][j]=false;
    }


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
