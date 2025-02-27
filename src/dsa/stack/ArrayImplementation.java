package dsa.stack;

public class ArrayImplementation {
    public static class Stacks{
       private int [] arr = new int[5];
        private int idx = 0;
       void push(int x){
           if(isFulll()) {
               System.out.println("Stack  is Full!");
               return;
           }
        arr[idx] = x;
        idx++;
       }
       int peek(){
        if(idx==0) return -1;
        System.out.println("Stack is Empty");
        return arr[idx-1];
       }
       int pop(){
           if(idx==0) {
               System.out.println("Stack is Empty");
               return -1;
           }
           int top = arr[idx-1];
           arr[idx-1] = 0;
           idx--;
           return top;
       }
       void display(){
           for(int  i=0;i<=idx-1;i++){
               System.out.println(arr[i]+" ");
           }
           System.out.println();
       }
       int size(){
           return idx;
       }
       boolean isFulll(){
           if(idx == arr.length) return true;
           else return false;
       }
        int capacity(){
           return arr.length;
        }
    }
    public static void main(String[] args){
        Stacks st=new Stacks();
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
        System.out.println(st.capacity());//5
    }
}
