package dsa.Prefix_Sum;
import java.util.HashMap;
import java.util.Map;
//Company Tags -> Facebook ✯   Amazon ✯   Google ✯   Microsoft ✯   Oracle ✯   tiktok   Bloomberg   Visa   Apple   Quora   Adobe   Expedia   Nvidia   ServiceNow   DoorDash   Bolt
//LeetCode -> https://leetcode.com/problems/subarray-sum-equals-k/description/
//Question -> Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.A subarray is a contiguous non-empty sequence of elements within an array.

public class subarraySumEqualsK {

        public static int subarraySum(int[] nums, int k) {
            Map<Integer, Integer> mp = new HashMap<>();
            mp.put(0, 1);
            int result = 0, sum = 0;

            for (int num : nums) {
                sum += num;

                if (mp.containsKey(sum - k))
                    result += mp.get(sum - k);

                mp.put(sum, mp.getOrDefault(sum, 0) + 1);
            }
            return result;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            int k = 3;
            System.out.println(subarraySum(nums, k)); // Expected output: 2
        }
    }


