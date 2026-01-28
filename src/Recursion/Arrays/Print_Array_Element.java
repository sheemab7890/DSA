package Recursion.Arrays;

public class Print_Array_Element {
    static void print(int n, int[] arr){
        if(n<0) return;

        print(n-1, arr);
        System.out.print(arr[n] +" ");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr.length-1, arr);

    }
}
