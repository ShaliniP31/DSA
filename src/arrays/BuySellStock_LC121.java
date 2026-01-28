package arrays;

public class BuySellStock_LC121 {

    public static void main(String[] args) {
//        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit1(prices));
        System.out.println(maxProfit2(prices));
    }

    //time exceeded for large input
    public static int maxProfit1(int[] prices) {
        int profit = 0, n = prices.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                profit = Math.max(profit, prices[j] - prices[i]);
            }
        }
        return profit;
    }

    public static int maxProfit2(int[] prices) {
        int maxProfit = 0, minPrice = prices[0];
        for (int price : prices) {
            minPrice = Math.min(price, minPrice);
            int profit = price - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
