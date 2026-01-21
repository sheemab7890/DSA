package Strings;

public class Create_CompareTo {

    static int compareTo(String a, String b){
       int minLength = Math.min(a.length(), b.length()); // Handle if 1 string is shorter

        for(int i=0; i<minLength; i++){
            int asciA = a.charAt(i);
            int asciB = b.charAt(i);

            if(asciA != asciB){
                return asciA - asciB;
            }
        }

        // If all characters matched
        return a.length() - b.length();

    }
    public static void main(String[] args) {
        String a = "apple";
        String b = "apply";
        System.out.println(compareTo(a,b));
        // If 0 then both are same
        // If +value then first is greater
        // If -value then second is greater
    }
}
