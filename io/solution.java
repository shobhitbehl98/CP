import java.io.*;
import java.util.*;
public class solution {

   static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(
                new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0,
                                 BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }


    public static class Pair {
            int i;
            int j;
            String psf;
        
            Pair(int i, int j,String psf) {
              this.i = i;
              this.j = j;
              this.psf=psf;
            }
        
          }


    
    public static void main(String[] args) throws IOException{
        Reader f = new Reader();
            try {
                System.setOut(new PrintStream(
                    new FileOutputStream("output.txt")));
                f = new Reader("input.txt");
  
            }
            catch (Exception e) {
                System.err.println(e);
            }
        
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         int[] arr=new int[t];
         for(int i=0;i<t;i++){
          arr[i]=f.nextInt();
         }
         int k=f.nextInt();
         boolean[][] dp=new boolean[t+1][k+1];
         dp[0][0]=true;
         for(int i=1;i<t+1;i++){
             for(int j=0;j<k+1;j++){
                 if(j==0){
                     dp[i][j]=true;
                 }
                 if(dp[i-1][j]||(arr[i-1]<=j&&dp[i-1][j-arr[i-1]])){
                       dp[i][j]=true;
                 }       
             }
          }
         sb.append(dp[dp.length-1][dp[0].length-1]+"\n");

          LinkedList<Pair> qu=new LinkedList<>();
          qu.addLast(new Pair(dp.length-1,dp[0].length-1,""));

          while(qu.size()>0){
            Pair r=qu.removeFirst();
            if(r.j==0){
                sb.append(r.psf+"\n");
                continue;
            }
            if(r.j>=arr[r.i-1]&&dp[r.i-1][r.j-arr[r.i-1]]){
                qu.addLast(new Pair(r.i-1,r.j-arr[r.i-1],r.i-1+" "+r.psf));
            }
            if(dp[r.i-1][r.j]){
                qu.addLast(new Pair(r.i-1,r.j,r.psf));
            }

          }

          System.out.println(sb);
    }
    }


    