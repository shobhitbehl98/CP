import java.io.*;
import java.util.*;
class CodeChef{
// public class XOR_Equal {

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
            String[] s=f.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int x=Integer.parseInt(s[1]);
            String[] m=f.nextLine().split(" ");
            int[] arr=new int[m.length];
            HashMap<Integer,Integer> hm=new HashMap<>();
            int max=1;
            for(int i=0;i<m.length;i++){
                 arr[i]=Integer.parseInt(m[i]);
                 if(hm.containsKey(arr[i])){
                     hm.put(arr[i], hm.get(arr[i])+1);
                }else{
                    hm.put(arr[i],(int)1);
                 }
                 max=Math.max(max,hm.get(arr[i]));
            }
            HashMap<Integer,Integer> nt=new HashMap<>();
            for(int i=0;i<arr.length;i++){
                int g=arr[i]^x;
                if(g==arr[i])continue;
                if(nt.containsKey(g)){
                    nt.put(g, nt.get(g)+1);
                }else{
                    nt.put(g, 1);
                }
            }
            int st=0;
            for(int e:nt.keySet()){
                if(hm.containsKey(e)){
                    if(nt.get(e)+hm.get(e)>max){
                        max=nt.get(e)+hm.get(e);
                        st=nt.get(e);
                    }else if(nt.get(e)+hm.get(e)==max){
                        st=Math.min(st,nt.get(e));
                    }
                }
            }


            sb.append(max+" "+st+"\n");
         }
         System.out.print(sb);
    }
    }


    

