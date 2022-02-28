import java.util.*;

public class group_anagrams {

	public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
		// write your code here
		HashMap<String,ArrayList<String>> hm=new HashMap<>();
        boolean[] vis=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            for(int j=i+1;j<strs.length;j++){
                if(strs[i].length()==strs[j].length()){
                    if(check(strs[i],strs[j])&&!vis[j]){
                        vis[i]=true;
                        vis[j]=true;
                        if(hm.containsKey(strs[i])){
                            ArrayList<String> s=hm.get(strs[i]);
                            s.add(strs[j]);
                        }else{
                            ArrayList<String> hs=new ArrayList<>();
                            hs.add(strs[i]);
                            hs.add(strs[j]);
                            hm.put(strs[i],hs);
                        }
                    }
                }
            }
            if(!vis[i]){
                ArrayList<String> ht=new ArrayList<>();
                ht.add(strs[i]);
                hm.put(strs[i],ht);
            }
        }
        
        ArrayList<ArrayList<String>> al=new ArrayList<>();
        for(String a:hm.keySet()){
            ArrayList<String> ala=new ArrayList<>(hm.get(a));
            al.add(ala);
        }
		return al;
	}

    public static boolean check(String s1, String s2){
		if(s2.length()!=s1.length()){
		    return false;
		}
		
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<s1.length();i++){
		    char ch=s1.charAt(i);
		    hm.put(ch,hm.getOrDefault(ch,0)+1);
		}
		HashMap<Character,Integer> hb=new HashMap<>();
		for(int i=0;i<s2.length();i++){
		    char ch=s2.charAt(i);
		    hb.put(ch,hb.getOrDefault(ch,0)+1);
		}
		
		for(char ch:hm.keySet()){
		    int a=hm.get(ch);
		    int b=hb.getOrDefault(ch,0);
		    if(a!=b)return false;
		}
		
		

		return true;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		ArrayList<ArrayList<String>> anagramsGrouped = groupAnagrams(arr);
		for (ArrayList<String> lst : anagramsGrouped) {
			Collections.sort(lst);
		}
		anagramsGrouped.sort(new ListComparator());
		display(anagramsGrouped);
	}

	// it is used to make the result unique
	static class ListComparator implements Comparator<List<String>> {
		@Override
		public int compare(List<String> l1, List<String> l2) {
			if (l1.size() != l2.size()) {
				return l2.size() - l1.size();
			}

			String l1str = l1.get(0);
			String l2str = l2.get(0);
			return l1str.compareTo(l2str);

		}
	}

	public static void display(ArrayList<ArrayList<String>> list) {
		for (int i = 0; i < list.size(); i++) {
			ArrayList<String> currList = list.get(i);
			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}
			System.out.println();
		}
	}

}
