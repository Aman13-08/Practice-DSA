package dsa.arrays;

import java.util.*;
//Company Tags ->  Amazon ✯
//LeetCode Link -> https://leetcode.com/problems/apply-operations-to-an-array/?envType=daily-question&envId=2025-03-01
//Question -> You are given a 0-indexed array nums of size n consisting of non-negative integers.
//You need to apply n - 1 operations to this array where, in the ith operation (0-indexed), you will apply the following on the ith element of nums:
// If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0. Otherwise, you skip this operation.After performing all the operations, shift all the 0's to the end of the array.
//For example, the array [1,0,2,0,0,1] after shifting all its 0's to the end, is [1,2,1,0,0,0].//Return the resulting array.Note that the operations are applied sequentially, not all at once.
public class ApplyOperationToArray {
    // Swap function to swap two elements in an array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public  static int[] applyOperations(int[] nums){
    int n = nums.length;
    int j=0;
    for(int i=0;i<n-1;i++){
        if(i+1<n && nums[i] == nums[i+1] && nums[i]!=0){
            nums[i] *=2;
            nums[i+1] = 0;
        }
        if(nums[i]!=0){
            if(i!=j){
                swap(nums , i ,j);
//                nums[j] = nums[i]; // Move the non-zero element to the j-th position
//                nums[i] = 0;       // Set the current position to 0
            }
            j++;
        }

    }
        return nums;
    }
    public static void main(String[] args) {
    int[] nums = {1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }
}
