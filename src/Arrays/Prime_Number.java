package Arrays;

import java.util.Scanner;

public class Prime_Number {

    public static void is_Prime(int num){
        boolean isPrime = true;
        if(num <=1 ){
            isPrime = false;
        }

        for(int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0) { // Divide num from 2-sqrt(num)
                isPrime = false;
                break; // important optimization
            }
        }

        if(isPrime){
            System.out.println("Num "+num +" is prime");
        }
        else {
            System.out.println("Num "+num +" is not prime");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numeber ");
        int num = sc.nextInt();

        is_Prime(num);

    }
}
