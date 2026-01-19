package Arrays;

import java.util.Scanner;

public class OddIdx_MulByTwo_And_EvenIdx_AddTen {

    public static void Odd_Even_Idx(int[] arr){
        int length = arr.length;

        for(int i=0; i<length; i++){
            if(i % 2 == 0){
                arr[i] += 10;
            }
            else {
                arr[i] *= 2;
            }
        }
    }

    public static void print_Array(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
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

        print_Array(arr);
        Odd_Even_Idx(arr);
        print_Array(arr);
    }
}
