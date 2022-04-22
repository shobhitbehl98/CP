import java.util.*;

public class longest_substring_atmost_k_unique {

	public static int solution(String s, int k) {
		HashMap<Character,Integer> hm=new HashMap<>();
		int i=0;
		int j=0;
		int max=0;
		while(i<s.length()){
		    if(hm.size()<=k){
                if(!(hm.size()==k&&!hm.containsKey(s.charAt(i)))){
		        max=Math.max((i-j+1),max);
                }
		        hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
		        i++;
		    }else{
		        while(hm.size()>k){
		        hm.put(s.charAt(j),hm.get(s.charAt(j))-1);
		        if(hm.get(s.charAt(j))==0){
		            hm.remove(s.charAt(j));
		        }
		        j++;
		        }
		    }
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}
