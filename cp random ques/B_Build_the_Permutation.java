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
            if (Math.abs(a - b) > 1  || a + b > (n - 2)) {
                sb.append(-1 + "\n");
                continue;
            }
           int[] arr=new int[n];
           for(int i=0;i<arr.length;i++){
               arr[i]=i+1;
           }
            
           if(a>b){
            int v=arr.length-1;
            while(a>0){
              int temp=arr[v];
              arr[v]=arr[v-1];
              arr[v-1]=temp;
              v-=2;
              a--;
            } 
           }else if(b>=a){
             int v=0;
             int u=b;
             while(u>0){
               int temp=arr[v];
               arr[v]=arr[v+1];
               arr[v+1]=temp;
               v+=2;
               u--;
             }
             if(b==a&&b>0){
                 int m=arr[arr.length-1];
                 arr[arr.length-1]=arr[arr.length-2];
                 arr[arr.length-2]=m;
             }
           }

           for(int val:arr){
               sb.append(val+" ");
           }
           sb.append("\n");

        }
        System.out.println(sb);
    }
}
