class Solution {
    public int change(int amt, int[] coins) {
        int dp[]=new int[amt+1];
        dp[0]=1;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<dp.length;j++)
            {
                dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[amt];
    }
}