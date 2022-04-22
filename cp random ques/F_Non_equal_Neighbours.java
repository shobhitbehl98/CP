import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class F_Non_equal_Neighbours {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    static long mod = 998244353;

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] a = new int[N + 1];
        Arrays.setAll(a, i -> i == 0 ? 0 : sc.nextInt());
        long[] dp = new long[N + 1];
        dp[0] = 1;
        Stack<long[]> stack = new Stack<>();
        long total = 0; // Invariant: total = sum of products of pairs in stack
        for (int r = 1; r <= N; r++) {
            int sign = r % 2 == 1 ? 1 : -1;
            long[] curr = {a[r], mult(sign, dp[r - 1])};
            while (stack.size() > 0 && a[r] <= stack.peek()[0]) {
                long[] prev = stack.pop();
                curr[1] = add(curr[1], prev[1]);
                total = sub(total, mult(prev[0], prev[1]));
            }
            stack.push(curr);
//            System.out.println("Adding " + Arrays.toString(curr));
            total = add(total, mult(curr[0], curr[1]));
            dp[r] = mult(sign, total); // flip sign back
        }
//        System.out.println(Arrays.toString(dp));
        out.println(dp[N]);
        out.close();
    }

    static long add(long a, long b) {
        if ((a += b) >= mod) {
            a -= mod;
        }
        return a;
    }

    static long sub(long a, long b) {
        if ((a -= b) < 0) {
            a += mod;
        }
        return a;
    }

    static long mult(long a, long b) {
        if ((a = a * b % mod) < 0) {
            a += mod;
        }
        return a;
    }

    static class FastScanner {
        private int BS = 1 << 16;
        private char NC = (char) 0;
        private byte[] buf = new byte[BS];
        private int bId = 0, size = 0;
        private char c = NC;
        private double cnt = 1;
        private BufferedInputStream in;
    
        public FastScanner() {
            in = new BufferedInputStream(System.in, BS);
        }
    
        public FastScanner(String s) {
            try {
                in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
            } catch (Exception e) {
                in = new BufferedInputStream(System.in, BS);
            }
        }
    
        char getChar() {
            while (bId == size) {
                try {
                    size = in.read(buf);
                } catch (Exception e) {
                    return NC;
                }
                if (size == -1) return NC;
                bId = 0;
            }
            return (char) buf[bId++];
        }
    
        int nextInt() {
            return (int) nextLong();
        }
    
        long nextLong() {
            cnt = 1;
            boolean neg = false;
            if (c == NC) c = getChar();
            for (; (c < '0' || c > '9'); c = getChar()) {
                if (c == '-') neg = true;
            }
            long res = 0;
            for (; c >= '0' && c <= '9'; c = getChar()) {
                res = (res << 3) + (res << 1) + c - '0';
                cnt *= 10;
            }
            return neg ? -res : res;
        }
    
        double nextDouble() {
            boolean neg = false;
            if (c == NC) c = getChar();
            for (; (c < '0' || c > '9'); c = getChar()) {
                if (c == '-') neg = true;
            }
            double cur = nextLong();
            if (c != '.') {
                return neg ? -cur : cur;
            } else {
                double frac = nextLong() / cnt;
                return neg ? -cur - frac : cur + frac;
            }
        }
    
        String next() {
            StringBuilder res = new StringBuilder();
            while (c <= 32) c = getChar();
            while (c > 32) {
                res.append(c);
                c = getChar();
            }
            return res.toString();
        }
    
        String nextLine() {
            StringBuilder res = new StringBuilder();
            while (c <= 32) c = getChar();
            while (c != '\n') {
                res.append(c);
                c = getChar();
            }
            return res.toString();
        }
    
        boolean hasNext() {
            if (c > 32) return true;
            while (true) {
                c = getChar();
                if (c == NC) return false;
                else if (c > 32) return true;
            }
        }
    }
    
    static void ASSERT(boolean assertion, String message) {
        if (!assertion) throw new AssertionError(message);
    }
    
    static void ASSERT(boolean assertion) {
        if (!assertion) throw new AssertionError();
    }
}