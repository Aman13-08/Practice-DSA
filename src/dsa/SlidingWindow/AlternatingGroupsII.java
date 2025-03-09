package dsa.SlidingWindow;

public class AlternatingGroupsII {
    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int res = 0;
        int left = 0;
        int n = colors.length;
        for(int right=1;right<(n+k-1);right++){

            // Skip entire subarray if current and previous elements are the same
            if (colors[right % n] == colors[(right - 1) % n]) {
                left = right;
            }
            // If subarray size equals k, increment result and move left
            if (right - left + 1 == k) {
                res++;
                left++; // Move to next subarray
            }
        }
        return res;
    }

    public static void main(String[] args) {
      int []  colors = {0,1,0,1,0};
      int k = 3;
        System.out.println(numberOfAlternatingGroups(colors ,k));
    }
}
