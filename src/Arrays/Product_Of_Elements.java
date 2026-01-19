package Arrays;


import java.util.Scanner;

public class Product_Of_Elements {
    public static int product_Of_Element(int[] arr){
        int length = arr.length;
        int prod = 1;

        for(int i=0; i<length; i++){
            prod *= arr[i];
        }
        return prod;
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

        int product = product_Of_Element(arr);
        System.out.println("Product is: "+ product);
    }
}
