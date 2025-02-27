package dsa.stack;
import java.util.*;
//Comapany Tags -> Amazon ✯   LinkedIn ✯   Facebook ✯   Microsoft ✯   Bloomberg ✯   Spotify   Apple   Adobe   Expedia   Google   Oracle   VMware   Cisco   Intel   Yandex   tiktok   Arista Networks   Barclays   ServiceNow   Uber   Goldman Sachs   Booking.com   Salesforce   Netflix   Dataminr   tcs
//LeetCode Link -> https://leetcode.com/problems/valid-parentheses/
public class ValidParenthese {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if ((c == ')' && stack.peek() != '(') ||
                        (c == ']' && stack.peek() != '[') ||
                        (c == '}' && stack.peek() != '{')) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isValid(s));
    }
}
