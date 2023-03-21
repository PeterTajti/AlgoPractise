public class CoinCombMin {
    public static void main(String[] args) {

        int[] coins = {1, 2};
        int totalAmount = 4;

        System.out.println(calculateCombo(coins, totalAmount, 0));
    }

    private static int calculateCombo(int[] coins, int amount, int currentIndex) {

        if (amount == 0) {
            return 0;
        }

        int result = Integer.MAX_VALUE;

        for (int i = currentIndex; i < coins.length; i++) {
            if (coins[i] <= amount) {
                int subResult = calculateCombo(coins, amount - coins[i], i);

                if (subResult != Integer.MAX_VALUE && subResult + 1 < result)
                    result = subResult + 1;
            }
        }
        return result;
    }
}