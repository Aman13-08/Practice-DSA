package dsa.Prefix_Sum;
import java.util.*;
//Comapy Tags ->  Twilio ✯   Amazon ✯   Facebook ✯   Snapchat ✯

// Leetcode Link -> https://leetcode.com/problems/subarray-sums-divisible-by-k/description/

//Questions ->Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
//A subarray is a contiguous part of an array.

public class subarraysDivByK {
    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1); // To count subarrays starting from index 0

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;
            int remainder = sum % k;

            // Handling negative remainders
            if (remainder < 0) {
                remainder += k;
            }

            // If this remainder has been seen before, it means a valid subarray exists
            count += remainderCount.getOrDefault(remainder, 0);//checks if remainder exists in the map

            // Update the remainder count
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        //int[] nums = {4, 5, 0, -2, -3, 1};
        int[] nums = {2, -6, 3,1,2,8,2,1};
        int k = 7;
        System.out.println(subarraysDivByK(nums, k)); // Output: 7
    }
}
