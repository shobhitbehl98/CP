import java.io.*;
import java.util.*;

// class CodeChef{
public class Treasure_Hunt {

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

    public static class Pair {
        int i;
        int j;
        int d;

        Pair(int i, int j, int d) {
            this.i = i;
            this.j = j;
            this.d = d;
        }

    }

    public static void main(String[] args) {
        FastReader f = new FastReader();
        StringBuilder sb = new StringBuilder();
        int t = f.nextInt();
        while (t-- > 0) {
            String[] s = f.nextLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            LinkedList<Pair> qu = new LinkedList<>();
            int[] num = new int[n + m - 1];
            boolean[][] v = new boolean[n][m];
            qu.addLast(new Pair(0, 0, 0));
            while (qu.size() > 0) {
                Pair r = qu.removeFirst();
                if (!v[r.i][r.j]) {
                    num[r.d]++;
                    v[r.i][r.j] = true;
                }else{
                    continue;
                }
                if (r.i + 1 < n) {
                    qu.addLast(new Pair(r.i + 1, r.j, r.d + 1));
                }
                if (r.j + 1 < m) {
                    qu.addLast(new Pair(r.i, r.j + 1, r.d + 1));
                }
            }
            int k = num.length - 1;
            int l = 1;
            int sum = n * m;
            int[] fa = new int[n + m - 1];
            while(k>=0){
            sum-=num[k];
            fa[l]=sum*num[l];
            if(l<num.length-1){
            l++;
            }
            k--;
            }
            long a=0;
            for(int i=1;i<fa.length;i++){
            a+=(fa[i]*((long)Math.pow(31,i-1)))%998244353;
            }
            sb.append(a+"\n");
        }
        System.out.println(sb);
    }
}
