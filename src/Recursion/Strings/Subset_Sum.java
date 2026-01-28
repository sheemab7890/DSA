package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class Subset_Sum {

    static void sum(int sum, int[] nums, int idx, List<Integer> ans){
        // Base case
        if (idx == nums.length) {
            ans.add(sum);
            return;
        }

        // 1️⃣ Include current element
        sum(sum + nums[idx], nums, idx + 1, ans);

        // 2️⃣ Exclude current element
        sum(sum, nums, idx + 1, ans);
    }


    public static void main(String[] args) {
        int[] nums = {5,6,7};
        List<Integer> ans = new ArrayList<>();
        sum(0,nums,0,ans);
        System.out.println(ans);
    }
}
