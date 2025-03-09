package dsa.stack;

import java.util.Stack;
//Leetcode tags - > Amazon ✯   Microsoft ✯   Adobe ✯   Facebook ✯   Uber ✯   Bloomberg   ByteDance   DoorDash

public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer>st = new Stack<>();
        int[] pse = new int[n];
        int[] nse = new int[n];
        // Compute Previous Smaller Element (PSE)   -------------------->
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ?  -1 : st.peek() ;
            st.push(i);
        }
        st.clear();
        // Compute Next Smaller Element (NSE)              <--------------------
        for(int i = n-1; i>=0 ;i--){
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        // Compute Maximum Area
        int maxArea = 0;
        for (int i=0;i<n;i++){
            int width = nse[i] - pse[i] -1;
            maxArea = Math.max(maxArea , heights[i] * width);
        }

        return maxArea;
//        int n = heights.length;
//        Stack<Integer> st = new Stack<>();  // Stack to store indices of histogram bars
//        int maxArea = Integer.MIN_VALUE;   // Variable to track the maximum area found
//
//        // Iterate through each bar in the histogram
//        for (int i = 0; i <= n; i++) {
//            // If we reach the end, set currHeight to 0 to ensure all bars are processed
//            int currHeight = (i == n) ? 0 : heights[i];
//
//            // Maintain a **monotonic increasing stack**
//            while (!st.isEmpty() && currHeight < heights[st.peek()]) {
//                int height = heights[st.pop()];  // Height of the popped bar (processed rectangle)
//
//                // If the stack is empty, width extends from 0 to i
//                int width = st.isEmpty() ? i : i - st.peek() - 1;
//
//                // Calculate max area
//                maxArea = Math.max(maxArea, height * width);
//            }
//
//            // Push current index to stack
//            st.push(i);
//        }
//
//        return maxArea;  // Return the maximum found area
    }

    public static void main(String[] args) {
        int []heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
