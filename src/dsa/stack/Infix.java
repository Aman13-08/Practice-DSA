package dsa.stack;

import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                val.push(ch - '0'); // Push the digit onto the value stack
            } else {
                // Process operators based on precedence
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();
                    if (operator == '+') val.push(v1 + v2);
                    else if (operator == '-') val.push(v1 - v2);
                    else if (operator == '*') val.push(v1 * v2);
                    else if (operator == '/') val.push(v1 / v2);
                }
                op.push(ch); // Push the current operator onto the operator stack
            }
        }

        // Process any remaining operators in the stack
        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operator = op.pop();
            if (operator == '+') val.push(v1 + v2);
            else if (operator == '-') val.push(v1 - v2);
            else if (operator == '*') val.push(v1 * v2);
            else if (operator == '/') val.push(v1 / v2);
        }

        System.out.println(val.peek()); // Print the final result
    }

    // Helper method to determine operator precedence
    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') return 1;
        if (operator == '*' || operator == '/') return 2;
        return 0;
    }
}