package dsa.stack;
import  java.util.*;
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
        int[] nums =  {3,1,4,2};
        System.out.println(find132pattern(nums));
    }
}
