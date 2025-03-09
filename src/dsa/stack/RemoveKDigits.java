package dsa.stack;

import java.util.Stack;
//Compan tags ->  Amazon ✯   Microsoft ✯   Bloomberg ✯   Google ✯   Adobe ✯   Facebook   MakeMyTrip
//Question -> Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.

public class RemoveKDigits {
    public static String removeKdigits(String num, int K) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            // Remove larger elements to form the smallest number
            while (!st.isEmpty() && st.peek() > c && K > 0) {
                st.pop();
                K--;
            }

            // Push only if it's not a leading zero OR stack is not empty
            if (!st.isEmpty() || c != '0') {
                st.push(c);
            }
        }

        // Remove extra digits from the end if K > 0
        while (!st.isEmpty() && K > 0) {
            st.pop();
            K--;
        }

        // Build the result string
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }

        // Return "0" if the result is empty (to handle cases like "1000", k=3)
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKdigits(num, k)); //  output: "1219"
    }
}
