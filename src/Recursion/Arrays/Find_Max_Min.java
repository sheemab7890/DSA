package Recursion.Arrays;

public class Find_Max_Min {
    static int max(int[] arr,int start){
        // Base case: last index cross ho gaya
        if (start == arr.length) {
            return Integer.MIN_VALUE;
        }

        // Recursive call
        int smallAns = max(arr, start + 1);

        // Compare current element with result from rest
        return Math.max(arr[start], smallAns);

    }

    static int min(int[] arr,int start){
        // Base case: last index cross ho gaya
        if (start == arr.length) {
            return Integer.MIN_VALUE;
        }

        // Recursive call
        int smallAns = min(arr, start + 1);

        // Compare current element with result from rest
        return Math.min(arr[start], smallAns);
    }

    public static void main(String[] args) {
        int[] arr = {1,23,4,5};
        int start = 0;

        System.out.println(max(arr,start));
    }
}
