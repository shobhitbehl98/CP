/* Author shobhit_behl */

import java.io.*;
import java.util.*;

//class CodeChef
public class maze_jump {

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
        int n = f.nextInt();
        int m = f.nextInt();
        ArrayList<String> l=getpaths(0, 0, n-1, m-1);
        System.out.println(l);
    }

    public static ArrayList<String> getpaths(int i, int j, int n, int m) {
        if (i == n && j == m) {
            ArrayList<String> li=new ArrayList<>();
            li.add("");
            return li;
        }
        ArrayList<String> ans=new ArrayList<>();
        ArrayList<String> a=new ArrayList<>();
        ArrayList<String> b=new ArrayList<>();
        ArrayList<String> c=new ArrayList<>();
        if (j + 1 <= m) {
            a=getpaths(i, j + 1, n, m);
        }
        for(int x=0;x<a.size();x++){
             ans.add('h'+a.get(x));
        }
        if (i + 1 <= n) {
            b=getpaths(i + 1, j, n, m);
        }
        for(int x=0;x<b.size();x++){
            ans.add('v'+b.get(x));
        }
        if (i+1<=n&&j + 1 <= m) {
            c=getpaths(i+1, j + 1, n, m);
        }
        for(int x=0;x<c.size();x++){
             ans.add('d'+c.get(x));
        }

        return ans;

    }
}
