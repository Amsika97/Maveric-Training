package Advajavaassesment;

import java.util.Arrays;

public class BuildingJumps {
    public static void main(String[] args) {
        int[] heights = {3, 1, 5, 1, 4, 3};
        int maxJump = 2;
        int minJumps = calculateMinJumps(heights, maxJump);
        System.out.println("Minimum jumps required: " + minJumps);
    }

    public static int calculateMinJumps(int[] heights, int maxJump) {
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= Math.max(i - maxJump, 0); j--) {
                int heightDiff = Math.abs(heights[i] - heights[j]);
                dp[i] = Math.min(dp[i], dp[j] + heightDiff);
            }
        }

        return dp[n - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1];
    }
}