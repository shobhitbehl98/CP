import java.util.*;
public class cf_263A{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[][] arr=new int[5][5];
        String[] s1=scn.nextLine().split(" ");
        for(int j=0;j<arr[0].length;j++){
            arr[0][j]=Integer.parseInt(s1[j]);
        }
        String[] s2=scn.nextLine().split(" ");
        for(int j=0;j<arr[0].length;j++){
            arr[1][j]=Integer.parseInt(s2[j]);
        }
        String[] s3=scn.nextLine().split(" ");
        for(int j=0;j<arr[0].length;j++){
            arr[2][j]=Integer.parseInt(s3[j]);
        }
        String[] s4=scn.nextLine().split(" ");
        for(int j=0;j<arr[0].length;j++){
            arr[3][j]=Integer.parseInt(s4[j]);
        }
        String[] s5=scn.nextLine().split(" ");
        for(int j=0;j<arr[0].length;j++){
            arr[4][j]=Integer.parseInt(s5[j]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]==1){
                    System.out.print(Math.abs(i-2)+Math.abs(j-2));
                    break;
                    }
                }
            }
            scn.close();
        }
        
        
    }
