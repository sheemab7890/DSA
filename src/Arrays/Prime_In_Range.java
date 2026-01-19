package Arrays;

import java.util.ArrayList;

public class Prime_In_Range {

    public static boolean is_Prime(int num) {

        if (num <= 1) {
            return false;
        }

        int limit = (int) Math.sqrt(num);

        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) { // Divide num from 2-sqrt(num)
                return false;
            }
        }
        return true;
    }

    public static void prime_In_Range(int start, int end){

        var primes = new ArrayList<Integer>();

        for(int i=start; i<=end; i++){
            if(is_Prime(i)){
                primes.add(i);
            }
        }

        System.out.println(primes);
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 15;
        prime_In_Range(start, end);

    }
}
