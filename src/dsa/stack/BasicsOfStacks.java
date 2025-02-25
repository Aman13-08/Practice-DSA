package dsa.stack;

import java.util.*;

public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();//LIFO
        st.push(12);
        st.push(1);
        st.push(123);
        st.push(211);

        //st.pop();

        System.out.println( st.peek());
    }
}
