package Strings;

import java.util.Scanner;

public class Count_Vowels {

    public static int vowels(String s){
        int length = s.length();
        int count = 0;

        for(int i=0; i<length; i++){
            char ch = Character.toLowerCase(s.charAt(i)); // Take character and convert it to lower case
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String name = sc.nextLine();
        System.out.println(vowels(name));

    }
}
