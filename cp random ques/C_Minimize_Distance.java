import java.io.*;
import java.util.*;

public class C_Minimize_Distance {

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

    public static void main(String[] args) {
        FastReader f = new FastReader();
        StringBuilder sb = new StringBuilder();
        int t = f.nextInt();
        while (t-- > 0) {
            int n = f.nextInt();
            int k = f.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int h = f.nextInt();
                if (h < 0) {
                    h *= -1;
                    b.add(h);
                } else {
                    a.add(h);
                }
            }
            Collections.sort(a);
            Collections.sort(b);
            long ans = 0;
            if (b.size()==0||(a.size()>0&&(a.get(a.size() - 1) > b.get(b.size() - 1)))) {
                int i = b.size() - 1;
                while (i >= 0) {
                    ans += 2 * (b.get(i));
                    i -= k;
                }
                boolean y = false;
                int j = a.size() - 1;
                while (j >= 0) {
                    if (y) {
                        ans += 2 * (a.get(j));
                    } else {
                        ans += a.get(j);
                        y = true;
                    }
                    j -= k;
                }
            } else {
                int j = a.size() - 1;
                while (j >= 0) {
                    ans += 2*(a.get(j));
                    j -= k;
                }
                boolean y = false;
                int i = b.size() - 1;
                while (i >= 0) {
                    if (y) {
                        ans += 2 * (b.get(i));
                    } else {
                        ans += b.get(i);
                        y = true;
                    }
                    i -= k;
                }

            }
            sb.append(ans+"\n");

        }
        System.out.println(sb);
    }
}
