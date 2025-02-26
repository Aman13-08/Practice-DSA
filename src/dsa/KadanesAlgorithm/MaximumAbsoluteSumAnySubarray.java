package dsa.KadanesAlgorithm;
import java.util.*;
//Company Tags ->  Amazon ✯   Adobe ✯
//LeetCode Link ->
//Question ->You are given an integer array nums. The absolute sum of a subarray [numsl, numsl+1, ..., numsr-1, numsr] is abs(numsl + numsl+1 + ... + numsr-1 + numsr).
// //Return the maximum absolute sum of any (possibly empty) subarray of nums.Note that abs(x) is defined as follows:If x is a negative integer, then abs(x) = -x.If x is a non-negative integer, then abs(x) = x.

public class MaximumAbsoluteSumAnySubarray {
    public static int maxAbsoluteSum(int[] nums) {
        return Math.max(
                Math.abs(minSS(nums)),
                Math.abs(maxSS(nums))
        );
    }

    private static int minSS(int[] nums){
        int sum=0,min = Integer.MAX_VALUE;
        for(int num:nums){
            sum+=num;
            if(min > sum)
                min = sum;
            if(sum>0)
                sum=0;
        }
        return min;
    }

    private static int maxSS(int[] nums){
        int sum=0;
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            sum+=num;
            if(max < sum)
                max = sum;
            if(sum<0)
                sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
       int[] nums = {1,-3,2,3,-4};
        System.out.println(maxAbsoluteSum(nums));
    }
}
