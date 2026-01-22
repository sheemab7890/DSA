package Strings;

import java.util.Arrays;

public class Anagram {
    static boolean bruteForceAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

      char[] arr1 = s1.toCharArray();
      char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<s1.length(); i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;

    }

    static boolean optimisedAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        //System.out.println(bruteForceAnagram(str1,str2));
        System.out.println(optimisedAnagram(str1, str2));
    }
}
