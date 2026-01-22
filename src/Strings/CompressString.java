package Strings;

public class CompressString {

    static void compress(String s){
        char[] arr = s.toCharArray();
        int i=0;
        int j=0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        while (j<n){
            if(arr[i] == arr[j]){
                j++;
            }
            else {
                int numtoadd = j-i;
                if(numtoadd > 1){
                    sb.append(arr[i]);
                    sb.append(numtoadd);
                }
                i = j;
            }
        }
        // when i>n then last character is left
        int numtoadd = j-i;
        if(numtoadd > 1){
            sb.append(arr[i]);
            sb.append(numtoadd);
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        String name = "aaabbcdde";
        compress(name);
    }
}
