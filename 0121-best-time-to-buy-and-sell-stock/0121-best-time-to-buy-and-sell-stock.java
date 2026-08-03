class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int curr_profit=0;
        int max_profit=Integer.MIN_VALUE;
        int curr_min=prices[0];
        for(int i=1;i<n;i++)
        {
            curr_profit=prices[i]-curr_min;
            if(curr_profit>max_profit)
            {
                max_profit=curr_profit;
            }
            if(curr_min>prices[i])
            {
                curr_min=prices[i];
            }
        }
        if(max_profit<0)
        {
            max_profit=0;
        }
        return max_profit;
    }
}