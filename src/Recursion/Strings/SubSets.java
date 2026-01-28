package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    static void subset(String ans, String s, int idx, List<String> list){
        if(idx == s.length()){
            if(ans.length() !=0) list.add(ans);
            return;
        }

        char ch = s.charAt(idx);
        subset(ans+ch,s,idx+1,list); // Pick
        subset(ans,s,idx+1,list); // Skip
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> ans = new ArrayList<>();
        subset("",s,0,ans);
        System.out.println(ans);

    }
}
