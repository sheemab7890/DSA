package Arrays;

import java.util.Scanner;

public class Reverse_Array {

    public static void printArray(int[] arr){
        for(int ele: arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverseArray(int[] arr){
        int length = arr.length;

        int left = 0;
        int right = length-1;

        while(left < right){
            swap(arr, left, right);

          left++;
          right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }
}
