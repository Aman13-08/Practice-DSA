package dsa.arrays;

public class FindTheNumberOfCopyArrays {
    public static int countArrays(int[] original, int[][] bounds) {
        int n = original.length;
        // Initialize the range for copy[0]
        int left = bounds[0][0]; // lower bound
        int right = bounds[0][1]; // upper bound

        // Iterate through the array
        for (int i = 1; i < n; i++) {
            int diff = original[i] - original[0]; // difference between original[i] and original[0]

            // Update the range for copy[0]
            left = Math.max(left, bounds[i][0] - diff);   // Ensure x is at least this value
            right = Math.min(right, bounds[i][1] - diff); // Ensure x is at most this value
        }

        // If no valid range, return 0; otherwise, return the count of possible arrays
        return Math.max(0, right - left + 1);
    }

    public static void main(String[] args) {
    int[]  original = {1,2,3,4};
    int [][]bounds = {{1,2},{2,3},{3,4},{4,5}};
        System.out.println(countArrays(original,bounds));
    }
}
