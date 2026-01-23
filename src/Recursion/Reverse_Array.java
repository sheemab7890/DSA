package Recursion;

public class Reverse_Array {
    static void reverse(int[] num, int s, int e){
        if(s>=e){
            return;
        }
        //Swapping(Doing work)
        int temp = num[s];
        num[s] = num[e];
        num[e] = temp;

        // Calling
        reverse(num, s+1, e-1);
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        reverse(num, 0,num.length-1);
        for(int ele : num){
            System.out.print(ele +" ");
        }
    }
}
