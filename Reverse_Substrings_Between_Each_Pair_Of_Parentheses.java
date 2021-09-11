import java.io.*;
import java.util.*;

public class Reverse_Substrings_Between_Each_Pair_Of_Parentheses {
    public static String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=')'){
                st.push(ch);
            }else{
                String h="";
                while(st.peek()!='('){
                    h+=st.pop();
                }
                st.pop();
                for(int j=0;j<h.length();j++){
                    st.push(h.charAt(j));
                }
            }
        }
        String ans="";
        while(st.size()>0){
            ans=st.pop()+ans;
        }
        
        return ans;
        
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String result = reverseParentheses(read.readLine());
        System.out.println(result);
        
    }
}
