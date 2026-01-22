package Strings;

public class SumOfSubstring {

    static int printSum(String s){
        int sum = 0;
        char[] arr = s.toCharArray();
        for(char ele : arr){
            sum+=ele-'0';
        }
        return sum;
    }
    static void substringSum(String s){
        int length = s.length();

        for(int i=0; i<length; i++){
            for(int j=i; j<length; j++){
               String subString = s.substring(i,j+1);
                System.out.print(printSum(subString)+ " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        String num = "12345";
        substringSum(num);
    }


}
