class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int v:nums) sum+=v;
        if(sum%2!=0) return false;
        boolean dp[][]=new boolean[n+1][sum/2+1];
        
        for(int i=0;i<n+1;i++)dp[i][0]=true;
        for(int i=0;i<sum/2+1;i++)dp[0][i]=false;
        
        for(int i=1;i<n+1;i++)
        {
            int runs=nums[i-1];
            for(int j=1;j<sum/2+1;j++)
            {
                if(j<runs){dp[i][j]=dp[i-1][j];}
                else{
                    if(dp[i-1][j]){dp[i][j]=true;}
                    else{
                        dp[i][j]=dp[i-1][j-runs];
                    }
                }
            }
        }
         
        return dp[n][sum/2];
    }
}