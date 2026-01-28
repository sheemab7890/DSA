package Recursion.Strings;

import Arrays.RotateArray_Left_Right;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {
    static void generate(String s, int n, int left, int right, List<String> ans){
        if(s.length() == 2*n){
            ans.add(s);
            return;
        }

        if(left < n) generate(s+"(",n,left+1,right,ans); // Agar left < n hah tb left add kr denge
        if(right < left) generate(s+")",n,left,right+1,ans); // Agar right < Left hah tb right add kr denge

    }
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = new ArrayList<>();
        generate("",n,0,0,ans);
        System.out.println(ans);
    }
}
