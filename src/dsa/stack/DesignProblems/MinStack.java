package dsa.stack.DesignProblems;
//Company Tags ->  Amazon ✯   Microsoft ✯   Bloomberg ✯   Facebook ✯   Google ✯   Salesforce   Adobe   Oracle
//Leetcode Link -> https://leetcode.com/problems/min-stack/description/

import java.util.Stack;

class MinStack {
    Stack<Integer> s; // Main stack storing all values
    Stack<Integer> ans; // Stack storing the minimum values

    public MinStack() {
        s = new Stack<>();  // Initialize main stack
        ans = new Stack<>(); // Initialize min stack
    }

    public void push(int val) {
        s.push(val); // Push value to main stack
        if (ans.isEmpty() || val <= ans.peek()) { // If min stack is empty OR val is the new minimum
            ans.push(val); // Push val to min stack
        }
    }

    public void pop() {
        if (!s.isEmpty()) { // Check if stack is not empty
            if (s.peek().equals(ans.peek())) { // If top of both stacks is the same, pop from min stack too
                ans.pop();
            }
            s.pop(); // Always pop from main stack
        }
    }

    public int top() {
        return s.peek(); // Return the top element of main stack
    }

    public int getMin() {
        return ans.peek(); // Return the top of min stack (minimum element)
    }



    public static void main(String[] args) {
        MinStack minStack = new MinStack(); // Create a MinStack object

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println(minStack.getMin()); // Output: -3
        minStack.pop();
        System.out.println(minStack.top());    // Output: 0
        System.out.println(minStack.getMin()); // Output: -2
    }
}


