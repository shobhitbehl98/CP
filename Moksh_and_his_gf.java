import java.io.*;
import java.util.*;

 public class Moksh_and_his_gf {
 public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     String[] s=scn.nextLine().split(" ");
     int[] arr=new int[Integer.parseInt(s[1])+1];
     for(int i=0;i<Integer.parseInt(s[1]);i++){
         String[] r=scn.nextLine().split(" ");
        arr[Integer.parseInt(r[0])]++;
        arr[Integer.parseInt(r[1])+1]--;
     }
     int[] res=new int[arr.length-1];
     int c=0;
     for(int i=0;i<res.length;i++){
         if(i==0){
           res[i]=arr[i];  
        }else{
           res[i]=arr[i]+arr[i-1];  
         }
         if(res[i]==Integer.parseInt(s[2])){
             c++;
         }
     }
 }
 }
