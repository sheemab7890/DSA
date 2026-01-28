package Recursion;

/*
   top-left corner (0,0) of a matrix of size M × N.
   want to reach the bottom-right corner (m-1, n-1).
 */

public class Path_To_Reach_Destination_In_MxN {
    static int path(int m, int n){
        if(m==1 || n==1) return 1;

        // m-1 -> means we remove one row and move down
        // n-1 -> means we remove one col and move right
        return path(m,n-1) + path(m-1, n);
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(path(m,n));

    }
}
