package dsa.BinarySearch;
// Patten -> maximum of some minimum' or 'minimum of some maximum
//Comapny Tags ->  CashFree ✯  Google , Amazon
//Question ->There are several consecutive houses along a street, each of which has some money inside. There is also a robber, who wants to steal money from the homes, but he refuses to steal from adjacent homes.
//The capability of the robber is the maximum amount of money he steals from one house of all the houses he robbed.
//You are given an integer array nums representing how much money is stashed in each house. More formally, the ith house from the left has nums[i] dollars.
//You are also given an integer k, representing the minimum number of houses the robber will steal from. It is always possible to steal at least k houses.
//Return the minimum capability of the robber out of all the possible ways to steal at least k houses.
public class HouseRobberIV {
    public static int minCapability(int[] nums, int k) {
        int start = Integer.MAX_VALUE, end = Integer.MIN_VALUE;

        for (int num : nums) {
            start = Math.min(start, num);
            end = Math.max(end, num);
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int housesRobbed = 0;

            // Check if we can rob at least k houses with this capability
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    housesRobbed++;
                    i++; // Skip adjacent house
                }
                if (housesRobbed >= k) break;
            }

            if (housesRobbed >= k) {
                end = mid;  // Try to minimize capability
            } else {
                start = mid + 1; // Increase capability
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,5,9};
        int k=2;
        System.out.println(minCapability(nums ,k));
    }
}
