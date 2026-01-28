package Recursion.Arrays;

public class Liner_Search {
    static boolean linear(int[] arr, int target, int idx){
        // base case: index out of bounds
        if (idx == arr.length) return false;

        // found
        if (arr[idx] == target) return true;

        return linear(arr, target, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(linear(arr,6,0));
    }
}
