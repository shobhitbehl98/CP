import java.io.*;
import java.util.*;
public class A_Construct_a_Rectangle {

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
            HashMap<Integer,Integer> map=new HashMap<>();
            int max=0;
            int idx=-1;
            int[] arr=new int[3]; 
            int l=0;
            for(int i=0;i<3;i++){
                int h=f.nextInt();
                map.put(h,map.getOrDefault(h, 0)+1);
                l=Math.max(map.get(h),l);
                arr[i]=h;
                if(arr[i]>max){
                    max=arr[i];
                    idx=i;
                }
            }
            if(l==1){
                int s=0;
                for(int i=0;i<3;i++){
                    if(i!=idx){
                        s+=arr[i];
                    }
                }
                if(arr[idx]!=s){
                    sb.append("NO\n");
                }else{
                    sb.append("YES\n");
                }
            }else if(l==2){
                for(int val:map.keySet()){
                    if(map.get(val)==1){
                        if((val%2==0)){
                        sb.append("YES\n");
                        }else{
                            sb.append("NO\n");
                        }
                        break;
                    }
                }
            }else{
                if(arr[0]%2==0){
                    sb.append("YES\n");
                }else{
                    sb.append("NO\n");
                }
            }
         }
         System.out.println(sb);
    }
    }


    

