import java.io.*;
import java.util.*;

public class Minimum_Remove_To_Make_Valid_Parentheses {
    public static String reverseParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
           if(arr[i]=='('){
               st.push(i);
           }else if(arr[i]==')'){
               if(st.size()>0){
                   st.pop();
               }else{
                   arr[i]='.';
               }
           }
        }
        while(st.size()>0){
            int idx=st.pop();
            arr[idx]='.';
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='.'){
            sb.append(arr[i]);
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String result = reverseParentheses(read.readLine());
        System.out.println(result);
        
    }
}
