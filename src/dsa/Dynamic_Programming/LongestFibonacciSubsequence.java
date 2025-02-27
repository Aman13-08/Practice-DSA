package dsa.Dynamic_Programming;
import  java.util.*;
//Company ->  Baidu ✯
//Leetcode Link -> https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/
//Question -> A sequence x1, x2, ..., xn is Fibonacci-like if:n >= 3 xi + xi+1 == xi+2 for all i + 2 <= n
//Given a strictly increasing array arr of positive integers forming a sequence, return the length of the longest Fibonacci-like subsequence of arr.
// If one does not exist, return 0 .A subsequence is derived from another sequence arr by deleting any number of elements (including none) from arr, without changing the order of the remaining elements. For example, [3, 5, 8] is a subsequence of [3, 4, 5, 6, 7, 8].

public class LongestFibonacciSubsequence {
    public static int  lenLongestFibSubseq(int[] arr) {
        if (arr.length <= 2) return 0;

        int n = arr.length;
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        int maxi = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int prev = arr[j];
                int prevv = arr[i];
                int len = 2;
                while (indexMap.containsKey(prev + prevv)) {
                    len++;
                    maxi = Math.max(maxi, len);
                    int temp = prev;
                    prev = prev + prevv;
                    prevv = temp;
                }
            }
        }

        return maxi > 2 ? maxi : 0;
    }

    public static void main(String[] args) {
        LongestFibonacciSubsequence sol = new LongestFibonacciSubsequence();
        int[] arr = {1,3,7,11,12,14,18};
        System.out.println("Longest Fibonacci-like subsequence length: " + lenLongestFibSubseq(arr));
    }
}
