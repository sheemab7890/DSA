package Strings;

public class NonRepeatingCharacters {
    static char nonRepeating(String s){
        int length = s.length();
        int[] freqArr = new int[26];

        for(int i=0; i<length; i++){
            char curr = s.charAt(i);
            int idx = curr - 'a';
            freqArr[idx]++;
        }

        for(int i=0; i<26; i++){
            if(freqArr[s.charAt(i)-'a'] == 1){
                return s.charAt(i);
            }
        }
        return '-';
    }

    public static void main(String[] args) {
        String name = "sheemab";
        System.out.println(nonRepeating(name));
    }
}
