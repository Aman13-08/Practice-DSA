package dsa.stack;

import java.util.Stack;
//LetCode Link -> https://leetcode.com/problems/clear-digits/description/
//Question -> You are given a string s.//Your task is to remove all digits by doing this operation repeatedly:
//Delete the first digit and the closest non-digit character to its left.
// Return the resulting string after removing all digits.Note that the operation cannot be performed on a digit that does not have any non-digit character to its left.
public class ClearDigits {
    public static String clearDigits(String s){
        // StringBuilder result = new StringBuilder();

        // for (char ch : s.toCharArray()) {
        //     if (ch >= 'a' && ch <= 'z') {
        //         result.append(ch);
        //     } else if (result.length() > 0) {
        //         result.deleteCharAt(result.length() - 1);
        //     }
        // }

        // return result.toString();
        Stack<Character>st = new Stack<>();

        for(char ch : s.toCharArray()){
            if (ch >= 'a' && ch <= 'z') {
                st.push(ch);
            }else if(!st.empty()){
                st.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "av32fe";
        System.out.println(clearDigits(s));
    }
}
