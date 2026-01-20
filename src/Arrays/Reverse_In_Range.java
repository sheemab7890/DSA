package Arrays;

public class Reverse_In_Range {

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }

    public static void reverseInRange(int[] arr, int start, int end){
       while (start < end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }

    }

    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,7,8,9};
      reverseInRange(arr,1,5);
      printArray(arr);
    }
}
