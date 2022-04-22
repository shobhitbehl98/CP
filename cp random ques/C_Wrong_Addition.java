import java.io.*;
import java.util.*;

public class C_Wrong_Addition {

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
            String[] n = f.nextLine().split(" ");
            String a = n[0];
            String b = n[1];
            String g = "";
            if(Long.parseLong(b)<Long.parseLong(a)){
                sb.append(-1+"\n");
                continue;
            }
            int w=0;
            while(a.length()<b.length()){
                a="0"+a;
                w++;
            }
           
            int i = a.length() - 1;
            int j = b.length() - 1;
            while (i >= 0 && j >= 0) {
                long x = a.charAt(i) - '0';
                long y = b.charAt(j) - '0';
                if (x > y) { 
                    if(j==0){
                        break;
                    }
                    long k = Long.parseLong(b.substring(j - 1 , j + 1));
                    if (k - x < 10 && k-x > 0) {

                        g = (k - x) + g;
                        j -= 2;
                        i--;
                    } else {
                        break;
                    }
                } else {
                    g = (y - x) + g;
                    i--;
                    j--;
                }
            }
            if (i>=w||j>=0) {
                sb.append(-1 + "\n");
            } else {
                sb.append(Long.parseLong(g) + "\n");
            }

        }
        System.out.println(sb);
    }
}
