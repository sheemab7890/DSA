package Strings;

public class PrintAllSubstrings {
    static void subString(String s){
        int length = s.length();

        for(int i=0; i<length; i++){
            for(int j=i; j<length; j++){
                System.out.print(s.substring(i,j+1) +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String name = "Sheemab";
        subString(name);
    }
}
