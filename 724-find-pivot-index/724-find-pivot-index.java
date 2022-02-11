class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0,lsum=0,rsum=0;
        for(int v:nums){sum+=v;}
        for(int i=0;i<nums.length;i++)
        {
            lsum+=nums[i];
            rsum=sum-lsum+nums[i];
            if(rsum==lsum)return i;
        }
        return -1;
    }
}