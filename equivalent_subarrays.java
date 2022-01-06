import java.util.*;

public class equivalent_subarrays {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i  < n; i++){
            arr[i] = scn.nextInt();
        }
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
		    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		int ans=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		int i=0;
		int j=0;
		while(i<arr.length){
		    while(i<arr.length&&hm.size()<map.size()){
		        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		        i++;
		    }
		  while(hm.size()==map.size()){
		      ans++;
		      ans+=arr.length-i;
		      hm.put(arr[j],hm.get(arr[j])-1);
		      if(hm.get(arr[j])==0){
		          hm.remove(arr[j]);
		      }
		      j++;
		  }
		}
		
		System.out.println(ans);
	}


}
