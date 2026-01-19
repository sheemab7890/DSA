package Arrays;

import java.util.Scanner;

public class Search_In_Array {

    public static void Exist_In_Array(int[] arr, int key){
        int length = arr.length;
        boolean is_Present = false;

        for(int i=0; i<length; i++){
            if(arr[i] == key){
                is_Present = true;
                break;
            }
        }

        if(is_Present){
            System.out.println(key +" is present");
        }
        else {
            System.out.println(key +" is not present");
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

        System.out.println("Enter the key you want to search: ");
        int key = sc.nextInt();

        Exist_In_Array(arr, key);

    }
}
