package Strings;

public class Conversion {

    static void charToAscii(char ch){
        int ascii = ch;
        System.out.println("Ascii value of "+ch +" is "+ascii);
    }

    static void asciiToChar(int ascii){
        char ch = (char)ascii;
        System.out.println("Char value of "+ascii +" is " +ch);
    }

    static void charDigitToInt(char ch){
        int n = ch - '0';
        System.out.println("Digit value of "+ch +" is "+ n);
    }
    static void sumOfCharDigit(String s){
        char[] arr = s.toCharArray();
        int sum = 0;

        for(char ele : arr){
            sum+=ele-'0';
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        char ch = 'A';
        charToAscii(ch);

        int ascii = 65;
        asciiToChar(ascii);

        char digitChar = '5';
        charDigitToInt(digitChar);

        sumOfCharDigit("123");
    }
}
