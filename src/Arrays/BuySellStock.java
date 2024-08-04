package Arrays;

public class BuySellStock {

    /**
     * Brute force
     * @param prices
     * @return maximum profit
     */
    public static int maxProfitBrute(int[] prices) {

        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    /**
     * Optimized solution - O(n) where n = number of array elements and needs only pass through the array
     * @param prices
     * @return maximum profit
     */
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Ensures that any price in the array will be less than the initial value,
        // allowing the algorithm to correctly find the minimum price.
        int maxProfit = 0;             // better naming, instead of just max, min or profit - make more descriptive

        for (int price : prices) {        // using enhanced for loop for clarity
            if (price < minPrice) {
                minPrice = price;
            }
            int potentialProfit = price - minPrice;      // using intermediate var to hold diff for readability
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit: " + maxProfit(prices));  // Output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum profit: " + maxProfit(prices2));  // Output: 0
    }

}
