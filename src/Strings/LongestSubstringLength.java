package Strings;

// The longest substring in a string will always be: THE ENTIRE STRING ITSELF
public class LongestSubstringLength {
    static int longSubstring(String s){
        int length = s.length();
        int maxlength = Integer.MIN_VALUE;

        for(int i=0; i<length; i++){
            for(int j=i; j<length; j++){
                String subString = s.substring(i,j+1);
                int lengthOfSubstring = subString.length();
                if(maxlength < lengthOfSubstring){
                    maxlength = lengthOfSubstring;
                }
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
          String name = "Sheemab";
        System.out.println(longSubstring(name));
    }
}
