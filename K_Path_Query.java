import java.io.*;
import java.util.*;
public class K_Path_Query {

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
    

    
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static class tri{
        Node temp=null;
        int val=0;

        tri(Node temp,int val){
            this.temp=temp;
            this.val=val;
        }
    }
    public static Node construction(int[][] arr){
        HashMap<Integer,tri> hm=new HashMap<>();
        Node root=null;
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i][0])==false){
                Node lc=new Node(arr[i][1],null,null);
                root=new Node(arr[i][0],lc,null);
                hm.put(arr[i][0],new tri(root,1));
                hm.put(arr[i][1],new tri(root.left,0));
            }else{
                if(hm.get(arr[i][0]).val==0){
                    tri gef=hm.get(arr[i][0]);
                    Node e=gef.temp;
                    e.left=new Node(arr[i][1],null,null);
                    gef.val++;
                    hm.put(arr[i][0],gef);
              hm.put(arr[i][1],new tri(e.left,0));
            }else if(hm.get(arr[i][0]).val==1){
                tri gef=hm.get(arr[i][0]);
                Node e=gef.temp;
                e.right=new Node(arr[i][1],null,null);
                gef.val++;
                hm.put(arr[i][0],gef);
                hm.put(arr[i][1],new tri(e.right,0));
            }
        }
    }
    return root;
}

public static class ds implements Comparable<ds>{
    ArrayList<Integer> al=new ArrayList<>();
    int val=0;

    ds(ArrayList<Integer> al,int val){
        this.al=al;
        this.val=val;
    }

    public int compareTo(ds o){
        return o.val-this.val;
    }
}

    public static ds ntr(int a,Node root){
        if(root==null){
            ArrayList<Integer> base=new ArrayList<>();
            return new ds(base,base.size());
        }
         if(root.data==a){
             ArrayList<Integer> base=new ArrayList<>();
             base.add(a);
            return new ds(base,base.size());
         }
         ds left=ntr(a,root.left);
         ds right=ntr(a,root.right);
        if(right.al.size()>0){
            right.al.add(root.data);
            return new ds(right.al,right.al.size());
        }
        if(left.al.size()>0){
            left.al.add(root.data);
        }
        return new ds(left.al,left.al.size());
    }
    public static void main(String[] args){
         FastReader f=new FastReader();
         StringBuilder sb=new StringBuilder();
         int t = f.nextInt();
         while(t-->0){
             int n=f.nextInt();
             int[][] iarr=new int[n-1][2];
             for(int ww=0;ww<iarr.length;ww++){
                 String[] s=f.nextLine().split(" ");
                 for(int w=0;w<s.length;w++){
                     iarr[ww][w]=Integer.parseInt(s[w]);
                 }
             }
            Node root=construction(iarr);
            int q=f.nextInt();
            // display(root);
            while(q-->0){
            String[] que=f.nextLine().split(" ");
           PriorityQueue<ds> pq=new PriorityQueue<>();
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<que.length;i++){
               int a=Integer.parseInt(que[i]);
               hm.putIfAbsent(a, 1);
               ds ntrp= ntr(a,root);
               pq.add(ntrp);
            }
            boolean yea=true;
            ds a=pq.remove();
            HashMap<Integer,Integer> lpe=new HashMap<>();
            int c=0;
            // System.out.println(a.al+" "+a.val);
            for(int i=0;i<a.al.size();i++){
                if(hm.containsKey(a.al.get(i))){
                    c++;
                }
                lpe.putIfAbsent(a.al.get(i), 1);
            }
            
            while(pq.size()>0){
                boolean rootmilgya=false;
                boolean lastwala=false;
                ds x=pq.remove();
                for(int i=x.al.size()-1;i>=0;i--){
                   if(lpe.containsKey(x.al.get(i))){
                       if(rootmilgya==false&&lastwala==false){
                       rootmilgya=true;
                       }else if(rootmilgya==true&&lastwala==false){
                          lastwala=true;
                       }
                    }else{
                        if(lastwala){
                            yea=false;
                            break;
                        }else if(hm.containsKey(x.al.get(i))){
                            c++;
                        }
                    }
                    
                }
                if(c==que.length){
                    yea=true;
                    break;
                }
                if(yea==false){
                    sb.append("NO\n");
                    break;
                }
            }
            if(yea){
                sb.append("YES\n");
            }
            }
    
    }
    System.out.println(sb);
}


}

