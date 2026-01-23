package Recursion;

public class Fibonacci {

    static int fibonachi(int n){
//           if(n==0) return 0;
//           if(n==1) return 1;
        if(n==0 || n==1){
            return n;
        } // Base Case

           return fibonachi(n-2) + fibonachi(n-1);
        }

    public static void main(String[] args) {
        int fib = 5;
        System.out.println(fibonachi(5));
    }
}
