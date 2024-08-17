package ArrayQuestion;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        Stack<Character> seen = new Stack<>();
        for (char c  : s.toCharArray()){
            if (c=='('||c=='{'){
                seen.push(c);
            }
            else{
                if (seen.isEmpty()){
                    return false;
                }
                char top = seen.pop();
                if ((c==')'&&top!='(')||
                (c=='}'&&top!='{')
                ){
                    return false;
                }
            }
        }
        return seen.isEmpty();
    }
}
