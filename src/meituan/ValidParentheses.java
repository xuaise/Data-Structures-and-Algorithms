package meituan;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('||s.charAt(i) == '['||s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else if(stack.size()<=0){
                return false;
            }
            else if(s.charAt(i) == ')'){
                if(stack.pop()!='('){
                    return false;
                }
            }
            else if(s.charAt(i) == ']'){
                if(stack.pop()!='['){
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
                if(stack.pop()!='{'){
                    return false;
                }
            }
        }
        if(stack.size()>0) return false;
        return true;
    }
}
