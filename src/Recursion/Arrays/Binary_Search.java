package Recursion.Arrays;

public class Binary_Search {
    static int binary(int[] arr, int target, int lo, int high){
        // Base case: element not found
        if (lo > high) {
            return -1;
        }

        int mid = lo + (high - lo) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] > target) {
            return binary(arr, target, lo, mid - 1);
        }
        else {
            return binary(arr, target, mid + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binary(arr,6,0, arr.length)-1);

    }
}
