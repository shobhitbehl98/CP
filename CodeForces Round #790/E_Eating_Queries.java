/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;

public class E_Eating_Queries {

    public static void main(String[] args) {
        FastReader f = new FastReader();
        StringBuilder sb = new StringBuilder();
        int t = f.nextInt();
        while (t-- > 0) {
            int n=f.nextInt();
            int q=f.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=f.nextInt();
                // System.out.print(arr[i]+" ");
            }
            // System.out.println();
            Arrays.sort(arr);
            int[] ps=new int[n];
            ps[n-1]=arr[n-1];
            for(int i=n-2;i>=0;i--){
                ps[i]=ps[i+1]+arr[i];
            }
            for(int i=0;i<q;i++){
                int qu=f.nextInt();
                if(qu>ps[0]){
                    sb.append(-1+"\n");
                    continue;
                }
                int x=0,y=n-1;
                int ans=-1;
                while(x<=y){
                  int mid=(x+y)/2;
                  if(ps[mid]>=qu){
                    x=mid+1;
                    ans=mid;
                  }else if(ps[mid]<qu){
                      y=mid-1;
                  }
                }
                sb.append(((n-1)-ans+1)+"\n");
                // for(int j=n-1;j>=0;j--){
                //     if(ps[j]>=qu){
                //         sb.append(((n-1)-j+1)+"\n");
                //         break;
                //     }
                // }


            }

        }
        System.out.println(sb);

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
