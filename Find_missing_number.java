import java.util.*;

public class Find_missing_number {


  //~~~~~~~~~~~~~~~User's Section~~~~~~~~~~~~~~~~~
  public static int firstMissingPositive(int[] arr) {
    // write your code here
    boolean one=false;
    int n=arr.length;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            one=true;
        }
        if(arr[i]>n||arr[i]<1){
            arr[i]=1;
        }
    }
    if(!one)return 1;
    for(int i=0;i<arr.length;i++){
        int idx=Math.abs(arr[i]);
        arr[idx-1]=-1*Math.abs(arr[idx-1]);
    }
    int ans=n;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            ans=i+1;
            break;
        }
    }
    
    return ans;
  }

  //~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int res = firstMissingPositive(arr);
    System.out.println(res);
  }
}