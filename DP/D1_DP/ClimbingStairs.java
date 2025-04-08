package Restart.DP.D1_DP;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n==1){return 1;}
        int ans=0;
        int prev1=1;
        int prev2=1;
        for(int i=2;i<=n;i++){
            ans=prev1+prev2;
            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(9));
    }
}
