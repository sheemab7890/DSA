package Recursion;

public class Sum {
    static int Summ(int n){
        if(n == 1){
            return 1;
        }

        return n + Summ(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Summ(n));
    }
}
