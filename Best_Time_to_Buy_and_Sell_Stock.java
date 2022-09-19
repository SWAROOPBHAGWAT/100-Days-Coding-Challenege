//Leetcode problem no.121
//Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
      
        int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      minPrice = Math.min(minPrice, prices[i]); // storing the minimum value of Stock
      maxPro = Math.max(maxPro, prices[i] - minPrice);  // store the max value after taking difference of prices
    }
    return maxPro;  // return maximum difference
    }
};
        
    
