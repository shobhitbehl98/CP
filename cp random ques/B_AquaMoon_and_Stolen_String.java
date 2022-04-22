import java.io.*;
import java.util.*;
public class B_AquaMoon_and_Stolen_String {

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
    public static class Pair{
        char g;
        int val=0;

        Pair(char g,int val){
            this.g=g;
            this.val=val;
        }
    }
    public static void main(String[] args){
        
         FastReader f = new FastReader();
         StringBuilder sb = new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
             String[] s=f.nextLine().split(" ");
             ArrayList<String> al=new ArrayList<>();
             @SuppressWarnings("unchecked")  HashMap<Integer, Integer>[] responseArray = new HashMap[26];
            for(int i=0;i<Integer.parseInt(s[0]);i++){
                String d=f.nextLine();
                al.add(d);
                for(int j=0;j<d.length();j++){
                   int w=d.charAt(i)-97;
                   responseArray[w].put(j,i);
                }
            }
            HashMap<Integer,Integer> hmm=new HashMap<>();
            for(int i=0;i<Integer.parseInt(s[0])-1;i++){
                String d=f.nextLine();
                int a=0;
                for(int j=0;j<d.length();j++){
                    int p=d.charAt(j)-97;
                    if(hmm.containsKey(responseArray[p].get(j))==false){
                        hmm.put(responseArray[p].get(j), 1);
                        a++;
                    }
                    if(a==2){
                        break;
                    }
                    }
                }
                for(int i=0;i<al.size();i++){
                    if(hmm.containsKey(i)==false){
                        sb.append(al.get(i)+"\n");
                        break;
                    }
                }
            }

            // for(int y:hmm.keySet()){
            // }
            // System.out.println();


            System.out.println(sb);
         }
    }
    

