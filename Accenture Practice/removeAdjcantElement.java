import java.util.*;
public class removeAdjcantElement {
    public static void main(String[] args){
        String s = "abbaca";
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        while(!st.isEmpty()){
            result.append(st.pop());
        }
        System.out.print(result.reverse().toString());
    }
}
