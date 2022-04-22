import java.io.*;
import java.util.*;
public class A_Shortest_Path_with_Obstacle {

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
    
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
            String blank=f.nextLine();
            String[] a=f.nextLine().split(" ");
            String[] b=f.nextLine().split(" ");
            String[] ob=f.nextLine().split(" ");

            int xa=Integer.parseInt(a[0]);
            int ya=Integer.parseInt(a[1]);
            int xb=Integer.parseInt(b[0]);
            int yb=Integer.parseInt(b[1]);
            int xob=Integer.parseInt(ob[0]);
            int yob=Integer.parseInt(ob[1]);

            if(Math.abs(xb-xa)<Math.abs(xob-xa)||Math.abs(yb-ya)<Math.abs(yob-ya)||(xb-xa)*(xob-xa)<0||(yb-ya)*(yob-ya)<0){
                sb.append(Math.abs(xb-xa)+Math.abs(yb-ya)+"\n");
            }else{
                if((Math.abs(xb-xob)==0||Math.abs(yb-yob)==0)&&((Math.abs(xb-xa)==0||Math.abs(yb-ya)==0))){
                    sb.append((Math.abs(xb-xa)+Math.abs(yb-ya)+2)+"\n");
                }else{
                    sb.append(Math.abs(xb-xa)+Math.abs(yb-ya)+"\n");
                }
        }
         }
         System.out.println(sb);
    }
    }

