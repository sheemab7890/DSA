package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GCD {

    static List<Integer> factList(int a){
        ArrayList<Integer> fact = new ArrayList<>();
        for(int i=1; i<=a; i++){
            if(a % i == 0){
                fact.add(i);
            }
        }
        return fact;
    }

    static int gcdBrute(int a, int b){
        int hcf = 1;

        for(int i = 1; i<=Math.min(a,b); i++){
            if(a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }

    static int gcdOptimized(int a, int b) {

        // Keep looping until remainder becomes 0
        while (b != 0) {

            // Find remainder
            int remainder = a % b;

            // Shift values:
            // b becomes new a
            a = b;

            // remainder becomes new b
            b = remainder;
        }

        // When b becomes 0,
        // a holds the GCD
        return a;
    }

    static int gcdRecursion(int i, int a, int b){
        if(i > a || i > b){
            return 1;
        }

        int hcf = gcdRecursion(i + 1, a, b);

        if(a % i == 0 && b % i == 0){
            // Math.max is REQUIRED because:
            // - Current i might be smaller than the divisor found later
            // - Recursion returns results in reverse order
            return Math.max(i, hcf);
        }

        return hcf;
    }

    static int gcdRecursionOptimised(int a, int b){
       if(b == 0){
           return a;
       }
       return gcdRecursionOptimised(b, a%b);
    }

    public static void main(String[] args) {
        int a = 65;
        System.out.println(factList(a));

        int num1 = 12;
        int num2 = 16;
        System.out.println(gcdBrute(num1, num2));
        System.out.println(gcdOptimized(num1, num2));

        System.out.println(gcdRecursion(1,num1,num2));
        System.out.println(gcdRecursionOptimised(num1, num2));

    }
}
