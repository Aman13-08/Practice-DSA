package dsa.Maths;
//Company ->  TCS ✯
//Question -> A valid cut in a circle can be:
//A cut that is represented by a straight line that touches two points on the edge of the circle and passes through its center, or
//A cut that is represented by a straight line that touches one point on the edge of the circle and its center.

public class MinimumCutstoDivideACircle {
    public static int  numberOfCuts(int n) {
        if(n==1) return 0;
        return n%2 > 0 ? n:n/2;
    }
    public static void main(String[] args) {
    int n=3;
        System.out.println(numberOfCuts(n));
    }
}
