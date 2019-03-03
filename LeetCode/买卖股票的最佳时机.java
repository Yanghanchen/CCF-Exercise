class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int max = 0;
        int buyPrice = prices[0];
        for(int i=1;i<prices.length;i++){
            buyPrice = prices[i]<buyPrice?prices[i]:buyPrice;
            max = Math.max(max,prices[i]-buyPrice);
        }
        return max;
    }
}