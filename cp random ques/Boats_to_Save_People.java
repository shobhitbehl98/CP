import java.util.*;

public class Boats_to_Save_People {

  // ~~~~~~~~~~~User's Section~~~~~~~~~~~~
  public static int numRescueBoats(int[] arr, int limit) {
    // write your code here
    Arrays.sort(arr);
    int ans=0;
    int sum=0;
    int i=0;
    int j=arr.length-1;
    while(i<=j){
        if(arr[i]+arr[j]<=limit){
            i++;
            j--;
        }else{
            j--;
        }
        ans++;
    }
    
    return ans;
  }

  // ~~~~~~~~~~Input Management~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] people = new int[n];

    for (int i = 0; i < n; i++)
      people[i] = scn.nextInt();

    int limit = scn.nextInt();
    int boats = numRescueBoats(people, limit);
    System.out.println(boats);
  }
}