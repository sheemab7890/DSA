package Recursion;

public class PrintN_1 {
    static void print(int n){
        if(n == 0){
            return;
        } // Base case

        System.out.print(n +" "); // Doing work
        print(n-1); //Function calling itself
    }
    public static void main(String[] args) {
      int n= 5;
      print(n);
    }
}
