package Recursion;

public class Print_Dec_Inc {
    static void decInc(int n){
        if(n == 0){
            return;
        }
        System.out.print(n +" ");
        decInc(n-1);
        if(n>1){
            System.out.print(n+ " ");
        }

    }
    public static void main(String[] args) {
        int n = 5;
        decInc(n);
    }
}
