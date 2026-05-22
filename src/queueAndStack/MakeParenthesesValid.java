package queueAndStack;

import java.util.Stack;

public class MakeParenthesesValid {
    public static void main(String[] args) {
        String s = "()[}(()(]}}";
        System.out.println(minAddToMakeValid(s));
    }

    private static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(ch == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
                if(ch == '}'){
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
                if(ch == ']'){
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
            }
        }

        return stack.size();
    }
}
