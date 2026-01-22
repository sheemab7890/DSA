package Strings;

public class ReverseString {
    static void reverseString(String s){
        int left = 0;
        int right = s.length()-1;

        StringBuilder sb = new StringBuilder(s);

        while(left < right){
            char temp = s.charAt(left);
            sb.setCharAt(left,s.charAt(right));
            sb.setCharAt(right,temp);
            left++;
            right--;
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String name = "Sheemab";
        reverseString(name);

        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        name = sb.toString();
        System.out.println(name);
    }
}
