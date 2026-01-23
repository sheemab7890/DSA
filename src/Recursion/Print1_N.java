package Recursion;

public class Print1_N {
    static void print(int n){
        if(n == 0){
            return;
        }
        print(n-1);
        System.out.print(n +" ");
    }

    static void printWithTwoParam(int start, int n){
        if(start > n){
            return;
        }

        System.out.print(start +" ");
        printWithTwoParam(start+1, n);
    }
    public static void main(String[] args) {
        int n = 5;
        printWithTwoParam(1,n);
        print(n);

    }
}
