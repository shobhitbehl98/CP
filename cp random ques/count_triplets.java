import java.util.*;
import java.io.*;

public class count_triplets {

  public static int countTriplets(int[]arr) {
    //write your code here
    Arrays.sort(arr);
    System.out.println();
    int k=arr.length-1;
    int j=k-1;
    int i=j-1;
    int c=0;
    while(k>=2){
        Arrays.sort(arr);
    // System.out.println();
    int k = arr.length - 1;
    int j = k - 1;
    int i = 0;
    int c = 0;
    while (k >= 2) {
      while (j >= 1 && j > i) {
        // System.out.println(k + " " + j + " " + i);
        if (arr[k] == arr[i] + arr[j]) {
          c++;
          i++;
        }
        else if (arr[k] > arr[i] + arr[j]) {
          i++;
        }else{
           j--; 
           i=0;
        }
      }
      k--;
      j = k - 1;
      i = 0;
    }

    return c;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.println(countTriplets(arr));
  }
}