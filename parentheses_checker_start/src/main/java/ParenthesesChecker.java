import java.util.Stack;

public class ParenthesesChecker {
        public static boolean checkParentheses(String testString) {
            Stack<Character> stack  = new Stack<Character>();
            for(int i = 0; i < testString.length(); i++) {
                char c = testString.charAt(i);
                if(c == '[' || c == '(' || c == '{' ) {
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
                }

            }
            return stack.isEmpty();
        }
    }

