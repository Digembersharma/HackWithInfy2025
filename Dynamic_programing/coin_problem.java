 import java.util.Arrays;

public class coin_problem {

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        
        // Fill dp with a large number
        Arrays.fill(dp, amount + 1);
        
        // Base case: 0 coins needed to make amount 0
        dp[0] = 0;

        // Bottom-up DP loop
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If dp[amount] was not updated, return -1
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int result = coinChange(coins, amount);
        System.out.println("Minimum coins needed: " + result);
    }
}
