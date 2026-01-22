package Strings;

public class ReverseEachWordsInString {
    static void reverseInRange(int start, int end, StringBuilder sb){
        while(start < end ){
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
          start++;
          end--;
        }
    }

    static void reverse(String s){
       int i=0;
       int j=0;
       int n = s.length();
       char[] arr = s.toCharArray();
       StringBuilder sb = new StringBuilder(s);

        while (j <= n) {
            // word end OR string end
            if (j == n || arr[j] == ' ') {
                reverseInRange(i,j-1,sb);
                i = j + 1;
            }
            j++;
        }
        System.out.println(sb);
    }

    static void reverseWordsRemoveExtraSpaces(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {

            // 1️⃣ Skip spaces
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            if (i >= n) break;

            // 2️⃣ Word start
            int start = i;

            // 3️⃣ Move to word end
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }

            int end = i - 1;

            // 4️⃣ Append reversed word
            for (int k = end; k >= start; k--) {
                result.append(s.charAt(k));
            }

            // 5️⃣ Add single space if more words exist
            result.append(' ');
        }

        // Remove last extra space
        result.deleteCharAt(result.length() - 1);

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        String name = "   My Name   Is Sheemab   ";
        reverse(name);
        reverseWordsRemoveExtraSpaces(name);

    }
}
