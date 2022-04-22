import java.util.*;

public class minDomino {

  //~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~
  public static int minDominoRotations(int[] tops, int[] bottoms){
    int c1=0;
    int c2=0;
    int c3=1;
    int c4=1;
    int ans=0;
    int a=tops[0];
    int b=bottoms[0];
    
    for(int i=1;i<tops.length;i++){
        if(c1==Integer.MAX_VALUE&&c2==Integer.MAX_VALUE&&c3==Integer.MAX_VALUE&&c4==Integer.MAX_VALUE){
            break;
        }
        
        if(tops[i]==a&&bottoms[i]==a){
            
        }else if(tops[i]==a&&c3<Integer.MAX_VALUE){
            c3++;
        }else if(bottoms[i]==a&&c1<Integer.MAX_VALUE){
            c1++;
        }else{
            c1=Integer.MAX_VALUE;
            c3=Integer.MAX_VALUE;
        }
        
        if(tops[i]==b&&bottoms[i]==b){
            
        }else if(bottoms[i]==b&&c4<Integer.MAX_VALUE){
            c4++;
        }else if(tops[i]==b&&c2<Integer.MAX_VALUE){
            c2++;
        }else{
            c2=Integer.MAX_VALUE;
            c4=Integer.MAX_VALUE;
        }
    }
    
    ans=Math.min(c1,Math.min(c2,Math.min(c3,c4)));
    if(ans==Integer.MAX_VALUE){
        return -1;
    }
    
    return ans;
    
  }

  //~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] top = new int[n];
    int[] bottom = new int[n];

    // read top
    for (int i = 0; i < top.length; i++) {
      top[i] = scn.nextInt();
    }
    // read bottom
    for (int i = 0; i < bottom.length; i++) {
      bottom[i] = scn.nextInt();
    }

    int rotation = minDominoRotations(top, bottom);
    System.out.println(rotation);
  }
}