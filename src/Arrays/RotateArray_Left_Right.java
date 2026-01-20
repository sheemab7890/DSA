package Arrays;

public class RotateArray_Left_Right {

    public static void printarray(int[] arr){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }

    public static void reverseInRange(int[] arr, int start, int end){
        int n = arr.length;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // LEFT ROTATION
    public static void leftRotate(int[] arr, int d){
        int n = arr.length;
        d = d % n; // handle d > n

        reverseInRange(arr, 0, d - 1);     // step 1
        reverseInRange(arr, d, n - 1);     // step 2
        reverseInRange(arr, 0, n - 1);     // step 3
    }

    // RIGHT ROTATION
    public static void rightRotate(int[] arr, int d){
        int n = arr.length;
        d = d % n;

        reverseInRange(arr, 0, n - d - 1); // step 1
        reverseInRange(arr, n - d, n - 1); // step 2
        reverseInRange(arr, 0, n - 1);     // step 3
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d =2;
        leftRotate(arr,d);
        printarray(arr);
    }
}
