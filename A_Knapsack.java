/* Author shobhit_behl */

import java.io.*;
import java.util.*;
//class CodeChef
public class A_Knapsack {

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
            long val;
            int idx;
        
            Pair(long val, int idx) {
              this.val = val;
              this.idx = idx;
            }

            public int compareTo(Pair o){
                return Long.compare(this.val,o.val);
            }
        
          }
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
           int m=f.nextInt();
           long n=f.nextLong();
           Pair[] arr=new Pair[m];
           for(int i=0;i<m;i++){
               long e=f.nextLong();
               arr[i]=new Pair(e,(i+1));
           }

           Arrays.sort(arr);
           StringBuilder r=new StringBuilder();
           int sum=0;
           int q=0;
           boolean dy=false;
           for(int i=arr.length-1;i>=0;i--){
               if((n%2==0&&sum+arr[i].val<((n/2)))||(n%2==1&&sum+arr[i].val<(((n+1)/2)))){
                   sum+=arr[i].val;
                   q++;
                  r.append(arr[i].idx+" ");
                }else if(((n%2==0)&&sum+arr[i].val>=(n/2)&&sum+arr[i].val<=n)||((n%2)==1&&sum+arr[i].val>=((n+1)/2)&&sum+arr[i].val<=n)){
                    dy=true;
                   sum+=arr[i].val;
                   q++;
                  r.append(arr[i].idx);
                  break;
               }
           }
           if(!dy){
               sb.append(-1+"\n");
           }else{
               r.reverse();
               r.append("\n");
               String y=r.toString();
               sb.append(q+"\n"+y);
           }
         }
         System.out.println(sb);
    }
    }


    

