import java.util.*;
public class cf_275A {
   public static void main(String[] main){
       Scanner scn=new Scanner(System.in);
       String[] l1=scn.nextLine().split(" ");
       String[] l2=scn.nextLine().split(" ");
       String[] l3=scn.nextLine().split(" ");
       int[][] arr=new int[3][3];
       for(int i=0;i<3;i++){
           arr[0][i]=Integer.parseInt(l1[i]);
       }
       for(int i=0;i<3;i++){
           arr[1][i]=Integer.parseInt(l2[i]);
       }
       for(int i=0;i<3;i++){
           arr[2][i]=Integer.parseInt(l3[i]);
       }
       int[][] input=new int[3][3];
       for (int[] row : input){
       Arrays.fill(row, 1);
       }
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               if((arr[i][j])%2==1){
                   input[i][j]=(input[i][j]+1)%2;
                   if(j-1>=0){
                      input[i][j-1]=(input[i][j-1]+1)%2;
                   }
                   if(j+1<arr.length){
                      input[i][j+1]=(input[i][j+1]+1)%2;
                   }
                   if(i-1>=0){
                      input[i-1][j]=(input[i-1][j]+1)%2;
                   }
                   if(i+1<arr.length){
                      input[i+1][j]=(input[i+1][j]+1)%2;
                   }
               }
           }
       }
       for(int i=0;i<input.length;i++){
           for(int j=0;j<input[0].length;j++){
              System.out.print(input[i][j]);
           }
           System.out.println();
       }
       scn.close();
   } 
}
