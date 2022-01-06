import java.util.*;

public class cnt_sub_k {

	public static int solution(String s, int k){
		HashMap<Character,Integer> chota=new HashMap<>();
		HashMap<Character,Integer> bada=new HashMap<>();
		int c=0;
		int b=0;
		int r=0;
		int ans=0;
        if(k==1){
            for(int i=0;i<s.length();i++){
                bada.put(s.charAt(i),bada.getOrDefault(s.charAt(i),0)+1);
            }

            for(char p:bada.keySet()){
                int h=bada.get(p);
                ans+=(h*(h+1))/2;
            }

            return ans;
        }
		while(b<s.length()||c<s.length()){
            while(bada.size()<=k){
                if(b==s.length()||(bada.size()==k&&!bada.containsKey(s.charAt(b)))){
                    break;
		        }
                bada.put(s.charAt(b),bada.getOrDefault(s.charAt(b),0)+1);
                b++;
		    }
		    while(chota.size()<=k-1){
		        if(c==s.length()||(chota.size()==k-1&&!chota.containsKey(s.charAt(c)))){
		            break;
		        }
		       chota.put(s.charAt(c),chota.getOrDefault(s.charAt(c),0)+1);
		       c++;
		    }
		    while(bada.size()==k&& chota.size()==k-1){
		         ans+=b-c;
                bada.put(s.charAt(r),bada.get(s.charAt(r))-1);
		        if(bada.get(s.charAt(r))==0){
                    bada.remove(s.charAt(r));
		        }
    		    chota.put(s.charAt(r),chota.get(s.charAt(r))-1);
		        if(chota.get(s.charAt(r))==0){
                    chota.remove(s.charAt(r));
		        }
                
		        r++;
		    }
		}
		

		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}
