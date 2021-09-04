import java.io.*;
import java.util.*;

public class Count_Distinct_Palindromic_Subsequence {

	public static int solution(String str) {
		int[] next=new int[str.length()];
		int[] prev=new int[str.length()];
		
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<prev.length;i++){
		    char c=str.charAt(i);
            if(hm.containsKey(c)==false){
                prev[i]=-1;
            }else{
                prev[i]=hm.get(c);
            }
            hm.put(c,i);
		}
		hm.clear();
		for(int i=next.length-1;i>=0;i--){
		    char m=str.charAt(i);
            if(hm.containsKey(m)==false){
                next[i]=-1;
            }else{
                next[i]=hm.get(m);
            }
            hm.put(m,i);
		}
		int[][] dp=new int[str.length()][str.length()];
		for(int i=0;i<str.length();i++){
		    for(int j=0,k=i;k<str.length();j++,k++){
		        if(i==0){
		           dp[j][k]=1; 
		        }else if(i==1){
		            dp[j][k]=2;
		        }else{
		            
		            char s=str.charAt(j);
		            char e=str.charAt(k);
		            
		            if(s!=e){
		              dp[j][k]=dp[j+1][k]+dp[j][k-1]-dp[j+1][k-1];  
		            }else{ 
		            int pe=prev[k];
		            int ns=next[j];
		            if(ns>pe){
		                dp[j][k]=2*dp[j+1][k-1]+2;
		            }else if(ns==pe){
		                dp[j][k]=2*dp[j+1][k-1]+1;
		            }else{
		                dp[j][k]=2*dp[j+1][k-1]-dp[ns+1][pe-1];
		            }
		        }
		        }
		    }
		}
		
		
		return dp[0][dp[0].length-1];
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}