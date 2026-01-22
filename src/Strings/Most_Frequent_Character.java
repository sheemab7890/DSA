package Strings;

public class Most_Frequent_Character {

    static char bruteForcefrequentChar(String s){
        int length = s.length();
        int maxFreq = -1;
        char freqCh = s.charAt(0);

        for(int i=0; i<length; i++){
            int freqOfChar = 0;
            char ch = s.charAt(i);
            for(int j=i+1; j<length; j++){
                if(s.charAt(j) == ch){
                    freqOfChar++;
                }
            }
            if(maxFreq < freqOfChar){
                maxFreq = freqOfChar;
                freqCh = ch;
            } else if (ch < freqCh && maxFreq == freqOfChar) {
                freqCh = ch;
            }
        }
        return freqCh;
    }

    static char frequentCharByFrequencyArray(String s){
        int length = s.length();
        int maxfreq = -1;
        char freqChar = s.charAt(0);
        int[] freqArr = new int[26];

        for(int i=0; i<length; i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freqArr[idx]++;
        }

        for(int i=0; i<26; i++){
            if(maxfreq < freqArr[i]){
                maxfreq = freqArr[i];
                freqChar = (char) (i + 'a');
            }
        }
        return freqChar;
    }

    static char frequentCharBySlidingWindow(String s){
        char[] arr = s.toCharArray();
        int n = s.length();
        int maxfreq = -1;
        char ch = arr[0];

        int i = 0;
        int j = 0;

        while (j<n){
            if(arr[i] == arr[j]){
                j++;
            }
            else{
                int windowlength = j-i;
                if(windowlength > maxfreq){
                    maxfreq = windowlength;
                    ch = arr[i];
                }
                i = j;
            }
        }
        // when j>n then last character is left
        int windowlength = j-i;
        if(windowlength > maxfreq){
            maxfreq = windowlength;
            ch = arr[i];
        }

        return ch;
    }

    public static void main(String[] args) {
        String str = "sheemab";
      //  System.out.println(bruteForcefrequentChar(str));
       // System.out.println(frequentCharByFrequencyArray(str));
        System.out.println(frequentCharBySlidingWindow(str));
    }
}
