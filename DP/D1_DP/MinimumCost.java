package Restart.DP.D1_DP;

public class MinimumCost {
    public static int minimizeCost(int k, int arr[]) {
        // code here
        int[] dp=new int[arr.length];
        dp[0]=0;
        dp[1]=Math.abs(arr[0]-arr[1]);
        for(int i=2;i<arr.length;i++){
            dp[i]=Math.abs(arr[i]-arr[i-1])+dp[i-1];
            for(int j=2;j<=k&&(i-j>=0);j++){
                dp[i]=Math.min(Math.abs(arr[i]-arr[i-j])+dp[i-j],dp[i]);
            }
        }
        return dp[arr.length-1];
    }
    public static void main(String[] args) {
        System.out.println(minimizeCost(1, new int[]{10, 20, 10}));
    }
}
