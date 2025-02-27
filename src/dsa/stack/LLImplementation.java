package dsa.stack;

public class LLImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class  LLStack{ //user define data structure

    private Node head = null;
    private int size = 0;

    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

//        void displayrec(Node h) {
//            if (h == null) return;
//            System.out.print(h.val + " "); // Print before recursion (normal order)
//            displayrec(h.next);
//        }
//        void display() {
//            displayrec(head);
//            System.out.println();
//        }

//        void displayRev(){
//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.val+" ");
//            temp = temp.next;
//         }
//         System.out.println();
//     }
void display() {
    Node temp = head;
    if (temp == null) {
        System.out.println("Stack is Empty");
        return;
    }

    // Use an array to store elements temporarily
    int[] arr = new int[size];
    int i = size - 1; // Start from the last index

    while (temp != null) {
        arr[i] = temp.val; // Store elements in reverse order
        temp = temp.next;
        i--;
    }

    // Print from bottom to top
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}

        int size(){
        return size;
     }
     int pop(){
        if(head==null){
            System.out.println("Stack is Empty");
            return -1;
        }
        int x =head.val;
        head = head.next;
         return x;
     }
     int peek(){
         if(head==null){
             System.out.println("Stack is Empty");
             return -1;
         }
         return head.val;
     }
        int capacity(){
            return head.val;
        }
        boolean isEmpty(){
        if(size == 0) return true;
        return false;
        }
    }
    public static void main(String[] args) {
        LLStack st=new LLStack();
        st.push(1);
        st.display();//1
        st.push(2);
        st.display();// 1 2
        st.push(3);
        st.display();//1 2 3
        System.out.println(st.size());//3
        System.out.println("POP "+st.pop());
        st.display();// 1 2
        System.out.println(st.size());//2
        System.out.println(st.capacity());
    }
}
