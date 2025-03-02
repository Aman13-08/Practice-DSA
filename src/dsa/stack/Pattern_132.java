package dsa.stack;
import  java.util.*;
//Company tags =  Amazon ✯   Bridgewater Associates ✯
//Questions -> Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].
//Return true if there is a 132 pattern in nums, otherwise, return false.

public class Pattern_132 {
    public static boolean find132pattern(int[] nums) {

        int n=nums.length;
        int num3=Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(nums[i]<num3){
                return true;
            }
            while(!st.isEmpty() &&  nums[i] >st.peek()){
                num3 = st.peek();
                st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums =  {3,1,4,2};// nums[i] < nums[k] < nums[j].
        System.out.println(find132pattern(nums));
    }
}
