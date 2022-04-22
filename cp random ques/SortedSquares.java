import java.util.*;

public class SortedSquares {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int n=nums.length;
        int left=0;
        int right=n-1;
        int i=n-1;
        while(i>=0){
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                ans[i]=Math.abs(nums[right]);
                right--;
            }else{
                ans[i]=Math.abs(nums[left]);
                left++;
            }
            ans[i]=ans[i]*ans[i];
            i--;
        }
        
        return ans;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++) 
            nums[i] = scn.nextInt();
        
        int[] res = sortedSquares(nums);

        for(int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}