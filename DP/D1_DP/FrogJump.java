package Restart.DP.D1_DP;

public class FrogJump {
    static int minCost(int[] height) {
        if(height.length==1){return 0;}
        int[] dp=new int[height.length];
        dp[0]=0;
        dp[1]=Math.abs(height[0]-height[1]);
        for(int i=2;i<height.length;i++){
            int step1=Math.abs(height[i]-height[i-1])+dp[i-1],
            step2=Math.abs(height[i]-height[i-2])+dp[i-2];
            dp[i]=Math.min(step1,step2);
        }
        return dp[height.length-1];
    }
    public static void main(String[] args) {
        System.out.println(minCost(new int[]{30, 20, 50, 10, 40}));
    }

}
