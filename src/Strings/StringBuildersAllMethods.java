package Strings;

public class StringBuildersAllMethods {

    public static void main(String[] args) {

        // 1. append() - Adds text at the END of the StringBuilder
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        System.out.println("append(): " + sb1);

        // 2. insert() - Inserts text at a SPECIFIC index
        StringBuilder sb2 = new StringBuilder("HelloWorld");
        sb2.insert(5, " ");
        System.out.println("insert(): " + sb2);

        // 3. delete() - Deletes characters from start index (inclusive) to end index (exclusive)
        StringBuilder sb3 = new StringBuilder("Hello World");
        sb3.delete(5, 11);
        System.out.println("delete(): " + sb3);

        // 4. deleteCharAt() - Deletes ONE character at the given index
        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.deleteCharAt(1);
        System.out.println("deleteCharAt(): " + sb4);

        // 5. replace() - Replaces characters from start to end index with new string
        StringBuilder sb5 = new StringBuilder("Hello World");
        sb5.replace(6, 11, "Java");
        System.out.println("replace(): " + sb5);

        // 6. reverse() - Reverses the entire string
        StringBuilder sb6 = new StringBuilder("Java");
        sb6.reverse();
        System.out.println("reverse(): " + sb6);

        // 7. charAt() - Returns character at given index
        StringBuilder sb7 = new StringBuilder("Java");
        char ch = sb7.charAt(2);
        System.out.println("charAt(): " + ch);

        // 8. setCharAt() - Replaces character at given index
        StringBuilder sb8 = new StringBuilder("Java");
        sb8.setCharAt(0, 'L');
        System.out.println("setCharAt(): " + sb8);

        // 9. length() - Returns number of characters
        StringBuilder sb9 = new StringBuilder("Hello");
        System.out.println("length(): " + sb9.length());

        // 10. toString() - Converts StringBuilder into String
        StringBuilder sb10 = new StringBuilder("Java");
        String str = sb10.toString();
        System.out.println("toString(): " + str);
    }
}

