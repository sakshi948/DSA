class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        
        mp.put(0,1);
        int sum=0,count=0;
        if(nums.length==1)
        {
            if(nums[0]!=k){return 0;}
            else{return 1;}
        }
        else{
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            
            int rsum=sum-k;
            if(mp.containsKey(rsum))
            {
                count+=mp.get(rsum);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        }
        return count;
    }
}