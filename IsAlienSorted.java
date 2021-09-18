import java.util.*;
import java.io.*;

public class IsAlienSorted {
public static void main(String[] args) throws NumberFormatException, IOException {
     Scanner scn =new Scanner(System.in);
     int n=scn.nextInt();
     String[] arr=new String[n];
     for(int i=0;i<n;i++){
         arr[i]=scn.nextLine();
     }
     String p=scn.nextLine();
     System.out.println(isAlienSorted(arr,p));
     
     
  }
  
   static HashMap<Character,Integer> hm=new HashMap<>();
    public static boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<order.length();i++){
            hm.put(order.charAt(i),i);
        }
        for(int i=1;i<words.length;i++){
           
           if(compare(words[i],words[i-1])>0){
            //    System.out.println(compare(words[i],words[i-1]));
               return false;
           }
            
        }
        return true;
    }

 public static int compare(String a, String b){
        int i=0,j=0;
        while(i<a.length()&&j<b.length()){
            if(hm.get(a.charAt(i))-hm.get(b.charAt(j))<0){
                // System.out.println(hm.get(a.charAt(i))+" "+hm.get(b.charAt(j)));
                return 1;
            }else if(hm.get(a.charAt(i))-hm.get(b.charAt(j))>0){
                return 0;
            }
            i++;
            j++;
        }
        if(a.length()<b.length()){
            return 1;
        }
        return 0;
    }
}
