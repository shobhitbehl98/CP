import java.util.*;

public class ksum {

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

  public static List<List<Integer>> k_Sum(int[] arr,int targ,int st,int en,int k) {
    List<List<Integer>> ans=new ArrayList<>();
    if(en-st+1<3){
        return ans;
    }
    for(int i=st;i<=en;i++){
        if(i>st&&arr[i]==arr[i-1]){
            continue;
        }
        int val=arr[i];
        int t=targ-val;
        int s=i+1;
        int e=arr.length-1;
        List<List<Integer>> l=new ArrayList<>();
       if(k-1!=2){
        l=k_Sum(arr,t,s,e,k-1);
        }else{
        l=ts(s,e,arr,t);
        }
        
        for(List<Integer> li:l){
            li.add(val);
            ans.add(li);
        }
    }    
    
    return ans;
    
  }    

  public static List<List<Integer>> kSum(int[] arr, int target,int k) {
    // write your code here
    List<List<Integer>> ans=new ArrayList<>();
    int n=arr.length;
    if(n<4){
        return ans;
    }
    Arrays.sort(arr);
    
    for(int i=0;i<n-3;i++){
        if(i>0&&arr[i]==arr[i-1]){
            continue;
        }
        int val=arr[i];
        int t=target-val;
        List<List<Integer>> l=new ArrayList<>();
        if(k==2){
          ans=ts(i+1,n-1,arr,t); 
          break;
        }
        if(k-1!=2){
        l=k_Sum(arr,t,i+1,n-1,k-1);
        }else{
        l=ts(i+1,n-1,arr,t);
        }
        for(List<Integer> b:l){
            b.add(val);
            ans.add(b);
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
    int k = scn.nextInt();
    List<List<Integer>> res = kSum(arr, target, k);
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