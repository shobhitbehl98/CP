import java.io.*;
import java.util.*;
public class cf_1537B {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
}

public static class Pair implements Comparable<Pair>{
    long val=0;
    long xa=0;
    long ya=0;

    Pair(long val,long xa,long ya){
        this.val=val;
        this.xa=xa;
        this.ya=ya;
    }

    @Override
    public int compareTo(Pair o) {
        return (int)(this.val-o.val);
    }
}

public static void main(String[] args){
    FastReader scn=new FastReader();
    StringBuilder sb=new StringBuilder();
    int t = scn.nextInt();
    // scn.nextLine();
    for(int i=0;i<t;i++){
      int f=scn.nextInt();
      int g=scn.nextInt();
      scn.nextInt();
      scn.nextInt();
      sb.append("1 1 "+f+" "+g+"\n");

    }
    System.out.println(sb);
}
    
}
