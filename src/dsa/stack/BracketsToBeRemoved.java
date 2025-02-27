package dsa.stack;
import java.util.*;
public class BracketsToBeRemoved {
    static int WronogPairs(String s){
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch=='(') {
                stack.push(ch);
            }
            else {
                if(!stack.isEmpty() && stack.peek()=='(') {
                    stack.pop();
                }
                else {
                    stack.push(ch);
                }
            }

        }

        return stack.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(WronogPairs(str));

    }
}
