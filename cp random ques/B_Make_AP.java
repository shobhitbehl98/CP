/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;

public class B_Make_AP {

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
            int a = f.nextInt();
            int b = f.nextInt();
            int c = f.nextInt();
            boolean x=false;
                
                if((a+c)%2==0&&((a+c)/2)%b==0){
                    x=true;
                }
                if (b >= a) {
                    int d = b - a;
                    // System.out.println(b+d+" "+a+" "+b+" "+c);
                    if ((b + d) % c == 0) {
                        x=true;
                    }
                }  
                    if (b >= c) {
                        int d = b - c;
                        // System.out.println(b+d+" "+a+" "+b+" "+c);
                        if ((b + d) % a == 0) {
                            x=true;
                        } 
                    }
            
            if(x){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }

        }
        System.out.println(sb);
    }
}
