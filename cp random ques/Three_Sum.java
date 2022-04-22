import java.util.*;

public class Three_Sum {
    
  public static List<List<Integer>> ts(int s,int e,int[] arr,int t){
    List<List<Integer>> a=new ArrayList<>();
    
    int i=s;
    int j=e;
    while(i<j){
        if(i!=s&&arr[i]==arr[i-1]){
            i++;
            continue;
        }
        if(arr[i]+arr[j]==t){
            List<Integer> li=new ArrayList<>();
            li.add(arr[i]);
            li.add(arr[j]);
            a.add(li);
            i++;
            j--;
        }else if(arr[i]+arr[j]<t){
            i++;
        }else{
            j--;
        }
    }
    
    return a;
  }    

  public static List<List<Integer>> threeSum(int[] arr,int targ) {
    List<List<Integer>> ans=new ArrayList<>();
    int n=arr.length;
    if(n<3){
        return ans;
    }
    Arrays.sort(arr);
    
    for(int i=0;i<=n-3;i++){
        if(i>0&&arr[i]==arr[i-1]){
            continue;
        }
        
        int val=arr[i];
        int t=targ-val;
        int s=i+1;
        int e=arr.length-1;
        
        List<List<Integer>> twoSum=ts(s,e,arr,t);
        
        for(List<Integer> li:twoSum){
            li.add(val);
            ans.add(li);
        }
    }    
    
    return ans;
    
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    List<List<Integer>> res = threeSum(arr, target);
    ArrayList<String> finalResult = new ArrayList<>();
    for (List<Integer> list : res) {
      Collections.sort(list);
      String ans = "";
      for (int val : list) {
        ans += val + " ";
      }
      finalResult.add(ans);
    }
    Collections.sort(finalResult);
    for (String str : finalResult) {
      System.out.println(str);
    }
    scn.close();
  }

}