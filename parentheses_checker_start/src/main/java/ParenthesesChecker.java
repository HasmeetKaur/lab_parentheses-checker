import java.util.Stack;

public class ParenthesesChecker {
    // Ensure that number of opening brackets match closing brackets
    // Check total bracket count is even/zero
    // Ensure that the different brackets have a corresponding closed bracket
    // Ensure that the order is correct

        public static boolean checkParentheses(String testString) {
            Stack<Character> stack  = new Stack<Character>();
            for(int i = 0; i < testString.length(); i++) {
                char c = testString.charAt(i);
                if(c == '[' || c == '(' || c == '{' || c == '<' ) {
                    stack.push(c);
                } else if(c == ']') {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                } else if(c == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                } else if(c == '}') {
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                } else if(c == '>') {
                    if(stack.isEmpty() || stack.pop() != '<') {
                        return false;
                    }
                }

            }
            return stack.isEmpty();
        }
    }

