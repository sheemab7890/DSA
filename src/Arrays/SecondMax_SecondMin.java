package Arrays;

public class SecondMax_SecondMin {

    public static int secondMax(int[] arr){
        int length = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0; i<length; i++){
            // If current element is greater than max
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            // If current element is not equal to max but greater than secondMax
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static int secondMin(int[] arr){
        int length = arr.length;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i=0; i<length; i++){
            // If current element is smaller than min
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            }
            // If current element is not equal to min but smaller than secondMin
            else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        return secondMin;

    }


    public static void main(String[] args) {
        int[] arr = {-5,-4,-3,-2,-1};
        System.out.println(secondMax(arr));
        System.out.println(secondMin(arr));
    }
}
