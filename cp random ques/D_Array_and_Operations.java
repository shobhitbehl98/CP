import java.io.*;
import java.util.*;

public class D_Array_and_Operations {

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
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = f.nextInt();
            }
            Arrays.sort(arr);
            boolean[] v = new boolean[n];
            int i = arr.length - 1;
            int j = i - 1;
            int score = 0;
            while (i >= 1 && j >= 0 && k > 0) {
                while (v[i]) {
                    i--;
                }
                while (v[j]||i==j) {
                    j--;
                }
                System.out.println(i + " " + j + " " + k);
                if (i == 0 || j < 0) {
                    break;
                }
                if (arr[j] < arr[i]) {
                    k--;
                    v[i] = true;
                    v[j] = true;
                } else {
                    i--;
                    j--;
                }
            }
            i = arr.length - 1;
            j = i - 1;
            displayb(v);
            while (i >= 1 && j >= 0 && k > 0) {
                while (v[i]) {
                    i--;
                }
                while (v[j]||i==j) {
                    j--;
                }
                System.out.println(i + "--" + j + " " + k);
                if (i == 0 || j < 0) {
                    break;
                }
                v[i] = true;
                v[j] = true;
                k--;
                score += 1;
            }
            for (int x = 0; x < arr.length; x++) {
                if (!v[x]) {
                    score += arr[x];
                }
            }
            System.out.println(score+" *");
            sb.append(score + "\n");
        }
        System.out.println(sb);
    }
    public static void display(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void displayb(boolean[] arr){
        for(boolean val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
