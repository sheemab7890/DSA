package Recursion.Strings;

public class ReverseString {
    static void reverse(StringBuilder sb, int s, int e){

        if(s>=e){
            return;
        }
        // swap characters
        char temp = sb.charAt(s);
        sb.setCharAt(s, sb.charAt(e));
        sb.setCharAt(e, temp);

        // recursive call
        reverse(sb, s + 1, e - 1);

    }
    public static void main(String[] args) {
        String str = "sheemab";
        StringBuilder sb = new StringBuilder(str);
        reverse(sb,0,str.length()-1);
        System.out.println(sb.toString());
    }
}
