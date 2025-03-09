package dsa.Maths;
//company ->  Adobe ✯   Apple ✯   Amazon ✯
//Question -> Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
public class SmallestEvenMultiple {
    public static int smallestEvenMultiple(int n) {
        if(n%2 ==0) return n;
        return n*2;
    }

    public static void main(String[] args) {
        int n =5;
        System.out.println(smallestEvenMultiple(n));
    }
}
