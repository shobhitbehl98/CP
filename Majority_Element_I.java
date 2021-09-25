import java.util.*;

public class Majority_Element_I {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static void printMajorityElement(int[] arr) {
        // write your code here
        int c=0;
        int d=-1;
        for(int i=0;i<arr.length;i++){
            if(c==0){
                d=arr[i];
                c++;
            }else if(arr[i]==arr[i-1]){
                c++;
            }else{
                c--;
                if(c==0){
                    d=-1;
                }
            }
        }
        
        if(d<0){
            System.out.println("No Majority Element exist");
        }else{
            int f=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==d){
                    f++;
                }
            }
            
            if(f>(arr.length/2)){
                System.out.println(d);
            }else{
                System.out.println("No Majority Element exist"); 
            }
        }
        
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        printMajorityElement(arr);
    }
}