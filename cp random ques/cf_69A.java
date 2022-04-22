import java.util.*;
public class cf_69A{
public static void main(String[] args){
  Scanner scn=new Scanner(System.in);
  int n=scn.nextInt();
  scn.nextLine();
  int x=0;
  int y=0;
  int z=0;
  for(int i=0;i<n;i++){
      String[] s=scn.nextLine().split(" ");
      x+=Integer.parseInt(s[0]);    
      y+=Integer.parseInt(s[1]);    
      z+=Integer.parseInt(s[2]);    
  }
  if(x==0&&y==0&&z==0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
  }
  scn.close();
}
}