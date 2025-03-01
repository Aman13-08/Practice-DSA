package dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] findNextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        // Traverse from the end to the start
        for (int i = nums.length - 1; i >= 0; i--) {
            // Pop elements from the stack that are smaller than the current element
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            // If the stack is empty, no greater element exists
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push the current element onto the stack
            stack.push(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 25};
        int[] result = findNextGreaterElements(nums);
        System.out.println();
        System.out.print("Next Greater Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}