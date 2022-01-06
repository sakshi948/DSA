class Solution {
    public int maxProfit(int[] prices) {
      int lsf=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
      for(int i=0;i<prices.length;i++)
      {
          if(prices[i]<lsf)
          {
              lsf=prices[i];
          }
          int base=prices[i]-lsf;
          if(base>max)
          {
              max=base;
          }
      }
            return max;

    }
}