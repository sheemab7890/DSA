package Arrays;

public class Nth_Prime_Number {

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

    public static int nth_Prime(int nth) {
        int count = 0;
        int num = 2; // first number to check

        while (true) {
            if (is_Prime(num)) {
                count++;
                if (count == nth) {
                    return num;
                }
            }
            num++;
        }
    }

    public static void main(String[] args) {
       int numToFind = 5;
        System.out.println(nth_Prime(numToFind));
    }
}
