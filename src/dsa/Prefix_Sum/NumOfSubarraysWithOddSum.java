package dsa.Prefix_Sum;
//Leetcode Link -> https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/description/
// Given an array of integers arr, return the number of subarrays with an odd sum. Since the answer can be very large, return it modulo 109 + 7.
public class NumOfSubarraysWithOddSum {

    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int M=(int)1e9+7;
        int sum = 0 ;
        int count = 0;
        int oddCnt = 0 ;
        int evenCnt = 1;

        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum%2==0){
                count = (count + oddCnt)%M;
                evenCnt++;
            }else{
                count = (count + evenCnt)%M;
                oddCnt++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        NumOfSubarraysWithOddSum solution = new NumOfSubarraysWithOddSum();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int result = solution.numOfSubarrays(arr);
        System.out.println();
        System.out.println("Output: " + result);
    }
}
