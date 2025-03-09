package dsa.Maths;
//Question -> There exists an infinitely large two-dimensional grid of uncolored unit cells. You are given a positive integer n, indicating that you must do the following routine for n minutes:
//At the first minute, color any arbitrary unit cell blue.
//Every minute thereafter, color blue every uncolored cell that touches a blue cell.
//Below is a pictorial representation of the state of the grid after minutes 1, 2, and 3.
public class CountTotalNumColoredCells {
    public static long coloredCells(int n) {
        int t=1;
        long cells = 1;
        while(t<=n){
            cells+=4*(t-1);
            t++;
        }
        return cells;
    }
    public static void main(String[] args) {
    int n = 3;
        System.out.println(coloredCells(n));
    }
}
