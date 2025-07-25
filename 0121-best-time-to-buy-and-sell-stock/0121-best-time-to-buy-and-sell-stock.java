class Solution {
    public int maxProfit(int[] prices) {
        int i=0,j=1;
        int n=prices.length;
        int profit=Integer.MIN_VALUE;
        while(j<n){
            int diff=prices[j]-prices[i];
            if(diff<0){
                i++;
            }
            if(prices[j]<prices[i]){
                i=j;
            }
            profit=Math.max(profit,diff);
            j++;
        }
        return profit<0?0:profit;
    }
}