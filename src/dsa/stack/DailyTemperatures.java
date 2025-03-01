package dsa.stack;
import java.util.*;
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temps) {
        int[] days = new int[temps.length]; // Array to store the result
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        for (int i = 0; i < temps.length; i++) {
            // Pop elements from the stack while the current temperature is greater than the temperature at the index on the stack
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int idx = stack.pop(); // Pop the index from the stack
                days[idx] = i - idx; // Calculate the number of days
            }
            stack.push(i); // Push the current index onto the stack
        }
        // Remaining elements in the stack have no warmer day, so their result is already 0 (default value)
        return days;
    }

    // Main method to test the code
    public static void main(String[] args) {
        DailyTemperatures solution = new DailyTemperatures();
        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = solution.dailyTemperatures(temps);

        // Print the result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
