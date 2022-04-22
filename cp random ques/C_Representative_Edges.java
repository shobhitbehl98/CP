/* Author _trevorphillips_ */

import java.io.*;
import java.util.*;

public class C_Representative_Edges {

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
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = f.nextInt();

            }
            if(n==0||n==1){
                System.out.println(0+"\n");
            }else{
            int ans=n-2;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int v=0;
                     for(int k=0;k<n;k++){
                        if((a[k] - a[i]) * (j - i) != (a[j] - a[i]) * (k - i)){
                            v++;
                        }    
                     } 
                     ans=Math.min(ans,v);
                }
             }
             System.out.println(ans);
            }
            }
        }

    }

