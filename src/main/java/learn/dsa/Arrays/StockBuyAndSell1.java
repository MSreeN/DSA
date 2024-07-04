package learn.dsa.Arrays;

public class StockBuyAndSell1 {
    public static void main(String[] args) {
//        int profit = buyAndSell(new int[]{1, 5, 3, 8, 12});
        int profit = buyAndSell(new int[]{3, 3, 5, 0, 0, 3, 1, 4});
        System.out.println(profit);
    }

    private static int buyAndSell(int[] prices){
        //gfg version - we try to buy and sell the stocks that's why you could see we do profit +=
//        int profit = 0;
//        int buy = prices[0];
//        int sell = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (buy >= prices[i]) {
//                buy = prices[i];
//            }
//            if (buy != 0 && buy < prices[i]) {
//                sell = prices[i];
//                profit+= sell - buy;
//                buy = prices[i];
//            }
//        }
//        return profit;

        //leetcode version: We do single transaction through out the array, like finding the
        // lowers and highest time to buy and sell stock that's why we just find the profit =
        // but not profit +=

        int profit = 0;
        int buy = prices[0];
        int sell = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buy >= prices[i]) {
                buy = prices[i];
            }
            if (buy < prices[i] && (prices[i] - buy ) > profit ) {
                sell = prices[i];
                profit = sell - buy;
            }
        }
        return profit;
    }

}
