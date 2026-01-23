package Recursion;

public class A_Power_B {
    static int aRaisedPowerB(int num, int power){
        if (power == 0) {
            return 1;
        }
        return num * aRaisedPowerB(num, power-1);
    }

    static int powerInLog(int num, int pow){
        if(pow == 0){
            return 1;
        }
        int half = powerInLog(num, pow/2);
        if(pow%2 == 0){
            return half*half;
        }
        return num*half*half;
    }
    public static void main(String[] args) {
        int num = 5;
        int pow = 2;
        System.out.println(aRaisedPowerB(num, pow));
        System.out.println(powerInLog(num, pow));
    }
}
