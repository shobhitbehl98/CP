import java.util.*;
public class cf_266B{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String[] s=scn.nextLine().split(" ");
        int t=Integer.parseInt(s[1]);
        String arr=scn.nextLine();
        for(int j=0;j<t;j++){
            int i=1;
        while(i<arr.length()){
            int m=1;
            if(arr.charAt(i-1)=='B'&& arr.charAt(i)=='G'){
                   arr=swap(i-1,i,arr);
                   m=2;
                }
                i+=m;
        }
    }
    scn.close();
    System.out.println(arr);


    }
    public static String swap(int s,int e,String d){
        char st=d.charAt(s);
        char en=d.charAt(e);
        String ans=d.substring(0, s)+en+st+d.substring(e+1);
        return ans;
    }
}