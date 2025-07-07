 import java.util.*;

public class question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read entire line of input
        String[] input = sc.nextLine().split(" ");

        // First input is the amount
        int amount = Integer.parseInt(input[0]);

        // Rest are coin denominations
        int[] coins = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            coins[i - 1] = Integer.parseInt(input[i]);
        }

        int count = 0;
        for (int coin : coins) {
            if (amount >= coin) {
                count += amount / coin;
                amount %= coin;
            }
        }

        System.out.println(count);
    }
}
