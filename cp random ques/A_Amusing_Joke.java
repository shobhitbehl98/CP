import java.io.*;
import java.util.*;

public class A_Amusing_Joke {

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
        String g = f.nextLine();
        String h = f.nextLine();
        String s = f.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < g.length(); i++) {
            if (!hm.containsKey(g.charAt(i))) {
                hm.put(g.charAt(i), 1);
            } else {
                hm.put(g.charAt(i), hm.get(g.charAt(i))+1);
            }
        }
        for (int i = 0; i < h.length(); i++) {
            if (!hm.containsKey(h.charAt(i))) {
                hm.put(h.charAt(i), 1);
            } else {
                hm.put(h.charAt(i), hm.get(h.charAt(i))+1);
            }
        }
        boolean is = true;
        for (int i = 0; i < s.length(); i++) {
            // System.out.println(s.charAt(i));
            if (!hm.containsKey(s.charAt(i))) {
                // System.out.println("wtf");
                is = false;
            } else {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
                if (hm.get(s.charAt(i)) == 0) {
                    hm.remove(s.charAt(i));
                }
            }
        }
        // System.out.println(hm.size());
        if(is&&hm.size()==0){
           System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
