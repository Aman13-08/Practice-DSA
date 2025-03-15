package dsa.SlidingWindow;

import java.util.HashMap;
//Question -> Given a string s consisting only of characters a, b and c.
//Return the number of substrings containing at least one occurrence of all these characters a, b and c.
//Leetcode ->  Microsoft ✯   Adobe ✯   DE Shaw ✯
public class NumberofSubstringsContainingAll3Characters {
    public  static int  numberOfsubstrings(String s) {
        int n= s.length();
        int result = 0;
        int i=0 ,j=0;

        HashMap <Character ,Integer> mp = new HashMap<>();
        while (j<n){
            char ch = s.charAt(j);
            mp.put(ch, mp.getOrDefault(ch , 0) +1);

            // Shrink window if we have at least one of each 'a', 'b', 'c'
            while (mp.getOrDefault('a', 0) > 0 &&
                    mp.getOrDefault('b', 0) > 0 &&
                    mp.getOrDefault('c', 0) > 0) {
                    result += (n-j);
                    char leftchar = s.charAt(i);// Count valid substrings
                 mp.put(leftchar , mp.getOrDefault(leftchar ,0) -1);
                     i++;// Move left pointer
            }
             j++;//// Expand the window
        }
        return result;
    }
    public static void main(String[] args) {
    String s = "abcabc";
        System.out.println(numberOfsubstrings(s));
    }
}
