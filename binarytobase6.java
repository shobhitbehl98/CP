import java.util.*;
public class binarytobase6{


public static void main(String[] args){
    boolean[] input={false,false,true,true};
    //  int[] h=getans(input);
    //  for(int i=0;i<h.length;i++){
    //      System.out.print(h[i]+" ");
    //  }
    String d=Integer.toString(Integer.parseInt("100000",2),6);
    System.out.println(d);
}

public static int[] getans(boolean[] base2){
    String x="";
for(int i=0;i<base2.length;i++){
         if(base2[i]==true){
            x+="0"; 
         }else{
             x+=1;
         }
     }
     int n=Integer.parseInt(x);
     int y=n;
     int b=1;
     int dv=0;
     while(y>0){
         int t=y%10;
         y/=10;
         dv+=t*b;
         b*=2;
     }
     ArrayList<Integer> ans=new ArrayList<>();
     while(dv>0){
         ans.add(dv/6);
         dv/=6;
     }
     int[] arr=new int[ans.size()];
     for(int k=ans.size()-1,m=0;k>=0&&m<arr.length;k--,m++){
         arr[m]=ans.get(k);
     }

     
     return arr; 
    }
    }