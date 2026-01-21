package Strings;

import java.util.*;

public class StringsAllMethods {

    // 1. length()
    // Returns total number of characters in the string
    static void lengthMethod(String s) {
        System.out.println("Length: " + s.length());
    }

    // 2. charAt()
    // Returns character present at given index
    static void charAtMethod(String s) {
        if (!s.isEmpty())
            System.out.println("First character: " + s.charAt(0));
    }

    // 3. toCharArray()
    // Converts string into character array
    static void toCharArrayMethod(String s) {
        char[] arr = s.toCharArray();
        System.out.println("Char Array: " + Arrays.toString(arr));
    }

    // 4. StringBuilder.reverse()
    // Reverses the string efficiently
    static void reverseMethod(String s) {
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Reversed: " + sb.reverse());
    }

    // 5. toLowerCase()
    // Converts all characters to lowercase
    static void toLowerCaseMethod(String s) {
        System.out.println("Lowercase: " + s.toLowerCase());
    }

    // 6. toUpperCase()
    // Converts all characters to uppercase
    static void toUpperCaseMethod(String s) {
        System.out.println("Uppercase: " + s.toUpperCase());
    }

    // 7. equals()
    // Compares content of two strings (case-sensitive)
    static void equalsMethod(String s) {
        System.out.println("Equals \"java\": " + s.equals("java"));
    }

    // 8. equalsIgnoreCase()
    // Compares strings ignoring case differences
    static void equalsIgnoreCaseMethod(String s) {
        System.out.println("EqualsIgnoreCase \"java\": " + s.equalsIgnoreCase("java"));
    }

    // 9. compareTo()
    // Lexicographically compares two strings
    static void compareToMethod(String s) {
        System.out.println("compareTo(\"java\"): " + s.compareTo("java"));
    }

    // 10. compareToIgnoreCase()
    // Lexicographical comparison ignoring case
    static void compareToIgnoreCaseMethod(String s) {
        System.out.println("compareToIgnoreCase(\"java\"): " + s.compareToIgnoreCase("java"));
    }

    // 11. trim()
    // Removes leading and trailing spaces
    static void trimMethod(String s) {
        System.out.println("Trimmed: \"" + s.trim() + "\"");
    }

    // 12. split()
    // Splits string into array using delimiter
    static void splitMethod(String s) {
        String[] parts = s.split(" ");
        System.out.println("Split words: " + Arrays.toString(parts));
    }

    // 13. substring(start)
    // Returns substring from given index to end
    static void substringStartMethod(String s) {
        if (s.length() >= 3)
            System.out.println("Substring from index 2: " + s.substring(2));
    }

    // 14. substring(start, end)
    // Returns substring from start to end-1 index
    static void substringRangeMethod(String s) {
        if (s.length() >= 5)
            System.out.println("Substring (1,4): " + s.substring(1, 4));
    }

    // 15. contains()
    // Checks if substring exists in string
    static void containsMethod(String s) {
        System.out.println("Contains \"a\": " + s.contains("a"));
    }

    // 16. indexOf()
    // Returns first occurrence index of character
    static void indexOfMethod(String s) {
        System.out.println("Index of 'a': " + s.indexOf('a'));
    }

    // 17. lastIndexOf()
    // Returns last occurrence index of character
    static void lastIndexOfMethod(String s) {
        System.out.println("Last index of 'a': " + s.lastIndexOf('a'));
    }

    // 18. replace()
    // Replaces all occurrences of a character
    static void replaceMethod(String s) {
        System.out.println("Replace 'a' with 'x': " + s.replace('a', 'x'));
    }

    // 19. replaceAll()
    // Replaces characters using regex
    static void replaceAllMethod(String s) {
        System.out.println("Only alphabets: " + s.replaceAll("[^a-zA-Z]", ""));
    }

    // 20. isEmpty()
    // Checks if string length is zero
    static void isEmptyMethod(String s) {
        System.out.println("Is empty: " + s.isEmpty());
    }

    // 21. String.valueOf()
    // Converts primitive data type into String
    static void valueOfMethod() {
        int num = 100;
        String s = String.valueOf(num);
        System.out.println("String.valueOf(100): " + s);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        lengthMethod(s);
        charAtMethod(s);
        toCharArrayMethod(s);
        reverseMethod(s);
        toLowerCaseMethod(s);
        toUpperCaseMethod(s);
        equalsMethod(s);
        equalsIgnoreCaseMethod(s);
        compareToMethod(s);
        compareToIgnoreCaseMethod(s);
        trimMethod(s);
        splitMethod(s);
        substringStartMethod(s);
        substringRangeMethod(s);
        containsMethod(s);
        indexOfMethod(s);
        lastIndexOfMethod(s);
        replaceMethod(s);
        replaceAllMethod(s);
        isEmptyMethod(s);
        valueOfMethod();

        sc.close();
    }
}

