class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=i+1;
        int n=prices.length;
        int profit=0;
        while(i<n&&j<n){
            if(prices[i]<prices[j]){
                profit=profit+prices[j]-prices[i];
                //i++;
                //j++;
            }
            i++;
            j++;
        }
        return profit;
    }
}