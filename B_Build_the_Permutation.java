import java.io.*;
import java.util.*;

public class B_Build_the_Permutation {

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
            String[] s = f.nextLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]);
            if (Math.abs(a - b) > 1 || n < 3||(a==0&&b!=0)||(a!=0&&b==0)||a+b>(n-2)) {
                sb.append(-1 + "\n");
                continue;
            }
            int i = 1;
            int j = n;
            if (a >= b) {
                while (i < j) {
                    if (a == 0) {
                        while (i <= j) {
                            sb.append(i + " ");
                            i++;
                        }
                        break;
                    }
                    sb.append(i + " " + j + " ");
                    i++;
                    j--;
                    a--;
                }
                if (i == j) {
                    sb.append(i + " ");
                    i++;
                    j--;
                }
            } else {
                while (i < j) {
                    if (b == 0) {
                        while (i <= j) {
                            sb.append(i + " ");
                            i++;
                        }
                        break;
                    }
                    sb.append(j + " " + i + " ");
                    i++;
                    j--;
                    b--;
                }
                if (i == j) {
                    sb.append(i + " ");
                    i++;
                    j--;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
