/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;

public class B_Bit_Flipping {

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
            char[] s = f.nextLine().toCharArray();

            if (k % 2 == 1) {
                for (int g = 0; g < s.length; g++) {
                    if (s[g] == '1') {
                        s[g] = '0';
                    } else {
                        s[g] = '1';
                    }
                }
            }
            int[] arr = new int[n];
            for (int i = 0; i < s.length; i++) {
                if (s[i] == '0' && k > 0) {
                    k--;
                    s[i] = '1';
                    arr[i]++;
                }
            }

            arr[n - 1] += k;
            if (k % 2 == 1) {
                s[n - 1] = '0';
            }
            for (int i = 0; i < s.length; i++) {
                sb.append(s[i]);
            }
            sb.append("\n");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
