import java.io.*;
import java.util.*;
public class C_Pair_Programming {

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
            String gap=f.nextLine();
            String[] s=f.nextLine().split(" ");
            String[] a=f.nextLine().split(" ");
            String[] b=f.nextLine().split(" ");
            boolean id=true;
            int i=0;
            int page=Integer.parseInt(s[0]);
            StringBuilder k=new StringBuilder();
            while(i<a.length&&i<b.length){
              if(Integer.parseInt(a[i])==0&&Integer.parseInt(b[i])!=0){
                  if(Integer.parseInt(b[i])<=page+1){
                      page++;
                     k.append("0 "+Integer.parseInt(b[i])+" ");
                    }else if(Integer.parseInt(b[i])<=page){
                      k.append(Integer.parseInt(b[i])+" 0 ");
                  }else{
                    id=false;
                    break;
                }
            }else if(Integer.parseInt(b[i])==0&&Integer.parseInt(a[i])!=0){
                if(Integer.parseInt(a[i])<=page+1){
                    page++;
                    k.append("0 "+Integer.parseInt(a[i])+" ");
                }else if(Integer.parseInt(a[i])<=page){
                    k.append(Integer.parseInt(a[i])+" 0 ");
                }else{
                    id=false;
                    break;
                }
            }else if(Integer.parseInt(a[i])==0&&Integer.parseInt(b[i])==0){
                page+=2;
                k.append("0 0 ");
            }else{
                if(Integer.parseInt(a[i])<=page&&Integer.parseInt(b[i])<=page){
                    k.append(Integer.parseInt(a[i])+" "+Integer.parseInt(b[i])+" ");
                }else{
                    id=false;
                    break;
                }
            }
              i++;
            }
            if(id){
            while(i<a.length){
                if(Integer.parseInt(a[i])==0){
                    page++;
                    k.append("0 ");
                }else if(Integer.parseInt(a[i])<=page){
                     k.append(Integer.parseInt(a[i])+" ");
                }
                i++;
            }
            while(i<b.length){
                if(Integer.parseInt(b[i])==0){
                    page++;
                    k.append("0 ");
                }else if(Integer.parseInt(b[i])<=page){
                     k.append(Integer.parseInt(b[i])+" ");
                }
                i++;
            }
        }   if(id){
            sb.append(k+"\n");
        }else{
            sb.append(-1+"\n");
        }
         }
         System.out.println(sb);
    }
    }

