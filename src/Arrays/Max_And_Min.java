package Arrays;

import java.util.Scanner;

public class Max_And_Min {

    public static int Max_In_Array(int[] arr){
        int length = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int Min_In_Array(int[] arr){
        int length = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
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

        int max = Max_In_Array(arr);
        int min = Min_In_Array(arr);

        System.out.println("Max element in array is "+max +" and Min element is "+ min);
    }
}
