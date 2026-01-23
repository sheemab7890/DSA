package Recursion;

public class Ways_To_Climb_Stairs {
    static int waysToStairs(int n){
        if(n==1) return 1; //Tf one stairs then take 1 step ata a time
        if(n==2) return 2; //If two stairs then 1,1 step or 2 step at a time (Total 2 ways)

        return waysToStairs(n-1) + waysToStairs(n-2);
    }
    public static void main(String[] args) {
        int n =6;
        System.out.println(waysToStairs(n));

    }
}
