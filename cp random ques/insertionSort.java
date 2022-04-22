/* Author shobhit_behl */

import java.io.*;
import java.util.*;

//class CodeChef
public class insertionSort {

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
        int m = f.nextInt();
        while (m-- > 0) {
            int n = f.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = f.nextInt();
            }
            for (int i = 1; i < n; i++) {
                int t = i;
                int j = i - 1;
                while (j >= 0 && arr[t] < arr[j]) {
                    int temp = arr[t];
                    arr[t] = arr[j];
                    arr[j] = temp;
                    t--;
                    j--;
                }
            }
            for (int val : arr) {
                System.out.print(val + " ");
            }
            HashMap<Integer,Integer> h=new HashMap<>();
            h.put(0,h.getOrDefault(0, 0)+1)
            System.out.println();
        }
    }
}
