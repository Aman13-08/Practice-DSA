package dsa.arrays;

import java.util.Arrays;

public class PartitionArrayAccordingToGivenPivot_2161 {

    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;

        // Count the number of elements less than and equal to the pivot
        int countLess = 0;
        int countEqual = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                countLess++;
            } else if (nums[i] == pivot) {
                countEqual++;
            }
        }

        // Initialize pointers for the result array
        int i = 0; // Pointer for elements less than pivot
        int j = countLess; // Pointer for elements equal to pivot
        int k = countLess + countEqual; // Pointer for elements greater than pivot

        int[] result = new int[n];

        // Populate the result array
        for (int num : nums) {
            if (num < pivot) {
                result[i] = num;
                i++;
            } else if (num == pivot) {
                result[j] = num;
                j++;
            } else {
                result[k] = num;
                k++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums, pivot)));
    }
}