package Arrays;


import java.util.HashMap;

public class Two_Sum {

    public static void bruteForce(int[] arr, int target){
        int length = arr.length;

        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Sum of "+ arr[i] +" and " +arr[j] +" is equal to "+target);
                    return;
                }
            }
        }
    }

    public static void optimisedApproach(int[] arr, int key){

        int length = arr.length;
        int start = 0; // First element of array
        int end = length-1; // Last element of array

        while (start < end){
           int sum = arr[start] + arr[end];
           if(sum == key){
               System.out.println("Sum of "+ arr[start] +" and " +arr[end] +" is equal to "+key);
               break;
           } else if (sum < key) {
               start++;
           }
           else {
               end--;
           }
        }
    }

    public static void optimisedApproachUsingHashmap(int[] arr, int key){
        // Store key value pair: KEY-curr element and VALUE-index of element
        HashMap<Integer, Integer> map = new HashMap<>();

        int length = arr.length;

        for(int i=0; i<length; i++){
            int needed = key - arr[i]; // Get what we want to return key
            if(map.containsKey(needed)){
                System.out.println("Sum of " + needed + " and " + arr[i] + " is equal to " + key);
                return;
            }
            map.put(arr[i], i);
        }

    }

    public static void main(String[] args) {
     int[] arr = {2,7,11,15};
     int target = 9;
 //    bruteForce(arr, target); //T.C - O(n^2)
 //      optimisedApproach(arr,target); // T.C -O(n) WORKS ONLY FOR SORTED ARRAY
        optimisedApproachUsingHashmap(arr,target); // T.C - O(n) WORKS FOR ANY ORDER OF THE ARRAY

    }
}
