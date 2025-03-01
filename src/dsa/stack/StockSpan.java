package dsa.stack;

import java.util.*;
//Compant tags ->  Amazon ✯   Bloomberg ✯   Adobe ✯

public class StockSpan {
    // Stack to store pairs: [price, span]
    Stack<int[]> stack; //

    public StockSpan() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        // Remove smaller prices and add their spans
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        // Push the current price and its span onto the stack
        stack.push(new int[]{price, span});
        return span;
    }

    public static void main(String[] args) {
        StockSpan stockSpanner = new StockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        for (int price : prices) {
            System.out.print(stockSpanner.next(price) + " ");
        }
    }
}





//public static ArrayList<Integer> calculateSpan(int[] arr) {
//    ArrayList<Integer> list = new ArrayList<>();
//    Stack<Integer> st = new Stack<>();
//    list.add(1); // Pehle din ka span hamesha 1 hota hai
//    st.push(0); // Pehle din ka index stack mein push karo
//
//    for (int i = 1; i < arr.length; i++) {
//        // Stack ke top ka price agar current price se chota ya equal hai, toh pop karo
//        while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
//            st.pop();
//        }
//        // Agar stack khali hai, toh span (i + 1) hoga
//        // Agar stack khali nahi hai, toh span (i - st.peek()) hoga
//        if (st.isEmpty()) {
//                // If stack is empty, all previous prices were smaller
//                list.add(i + 1);
//                list.add(i + 1);
//            } else {
//                // If stack is not empty, calculate span from nearest greater element
//                list.add(i - st.peek());
//            }
//        // Current index ko stack mein push karo
//        st.push(i);
//    }
//    return list;
//}






//Concept	Java (int[])	C++ (pair<int, int>)
//Stack element type	int[] (array of 2 elements)	pair<int, int>
//Accessing price	st.peek()[0]	st.top().first
//Accessing span	st.peek()[1]	st.top().second
//Removing element	st.pop()	st.pop()
//Adding to span	span += st.pop()[1]	span += st.top().second; st.pop();
//Pushing element	st.push(new int[]{price, span})	st.push({price, span})