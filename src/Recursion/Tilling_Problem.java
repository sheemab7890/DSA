package Recursion;

/*
    ❓ Question

You are given a 2 × N board and 2 × 1 tiles.

Each tile can be placed:
Vertically (standing)
Horizontally (lying)

👉 Find the number of ways to tile the board completely.

 */

public class Tilling_Problem {
    static int tilling(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;

        // n-1 -> tile placed horizontally occupy only 1 column
        // n-2 -> tile placed vertically occupy 2 column
        return tilling(n-1) + tilling(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilling(n));
    }
}
