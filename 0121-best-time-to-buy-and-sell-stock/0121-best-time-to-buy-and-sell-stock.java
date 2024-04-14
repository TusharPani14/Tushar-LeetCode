class Solution {
    public int maxProfit(int[] prices) {
        int j=0,max=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[j]<0){
                j=i;
            }else{
                max=Math.max(max,prices[i]-prices[j]);
            }
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}