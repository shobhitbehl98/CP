import java.util.*;
public class cf_32B {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String ans="";
        int p=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                if(i>0&&s.charAt(i-1)=='-'&&p==0){
                    ans+=1;
                }else{
                    ans+=0;
                    p=0;
                }
                if(p>0){
                  p=0;
                }
            }else if(s.charAt(i)=='-'){
               if(i>0&&s.charAt(i-1)=='-'&&p==0){
                   ans+=2;
                   p=1;
                }else if(p>0){
                    p=0;
                }
            }
        }
        System.out.println(ans);
        scn.close();
    }
}
