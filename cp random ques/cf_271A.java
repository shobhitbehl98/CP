import java.util.*;

public class cf_271A {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int s=scn.nextInt();
        scn.nextLine();
        for(int i=s+1;i<9999;i++){
            if(check(i)==true){
                System.out.println(i);
                break;
            }
        }


        scn.close();
    }
    public static boolean check(int s){
        String g=Integer.toString(s);
       HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;i<g.length();i++){
          if(hm.containsKey(g.charAt(i))){
              hm.put(g.charAt(i),hm.get(g.charAt(i))+1);
          }else{
              hm.put(g.charAt(i),1);
          }
       }
       for(char k:hm.keySet()){
           if(hm.get(k)>1){
               return false;
           }
       }
      return true;
    }
}
