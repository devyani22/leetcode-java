package Strings;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (char c : s.toCharArray()) {
            // Push the corresponding closing bracket onto the stack
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                // If the stack is empty or the top of the stack doesn't match the current closing bracket, return false
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        // If the stack is empty, all the brackets matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis validator = new ValidParenthesis();
        String s = "()[]{}";
        System.out.println(validator.isValid(s)); // Output: true

        s = "(]";
        System.out.println(validator.isValid(s)); // Output: false

        s = "([)]";
        System.out.println(validator.isValid(s)); // Output: false

        s = "{[]}";
        System.out.println(validator.isValid(s)); // Output: true
    }
}
