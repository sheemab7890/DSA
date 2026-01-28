package Recursion.Arrays;

public class First_Occurence {

    static int firstOccurrenceRecursive(int[] arr, int target, int lo, int high) {

        if (lo > high) return -1;

        int mid = lo + (high - lo) / 2;

        if (arr[mid] == target) {
            // check left side
            int leftAns = firstOccurrenceRecursive(arr, target, lo, mid - 1);

            // if left side me mila → wahi answer
            return (leftAns != -1) ? leftAns : mid;
        }
        else if (arr[mid] > target) {
            return firstOccurrenceRecursive(arr, target, lo, mid - 1);
        }
        else {
            return firstOccurrenceRecursive(arr, target, mid + 1, high);
        }
    }

    static int firstOccurrenceIterative(int[] arr, int target) {
        int lo = 0, high = arr.length - 1;
        int ans = -1;

        while (lo <= high) {
            int mid = lo + (high - lo) / 2;

            if (arr[mid] == target) {
                ans = mid;      // store answer
                high = mid - 1; // move left
            }
            else if (arr[mid] < target) {
                lo = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
