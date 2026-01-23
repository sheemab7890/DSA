package Recursion;

public class ReverseNumber {

    static int reverse(int num, int start){
        if(num == 0) return start;
        return reverse(num/10, start*10 + num%10);
    }
    public static void main(String[] args) {
     int num = 12345;
        System.out.println(reverse(num, 0));

    }
}
