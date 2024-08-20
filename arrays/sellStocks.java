class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minCost = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minCost;
            maxProfit = Math.max(maxProfit, profit);
            minCost = Math.min(minCost, prices[i]);
        }

        return maxProfit;
    }
}
