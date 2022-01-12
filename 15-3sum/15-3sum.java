class Solution{
public List<List<Integer>> threeSum(int[] nums) {

    HashSet<List<Integer>> ans = new HashSet<>();
    if(nums.length<3)
        return new ArrayList(ans);
    else{
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int l = i+1,r = nums.length-1;
            while(l<r){
                int sum = nums[l]+nums[r]+nums[i];
                if(sum==0)
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                if(sum<0)
                    l++;
                else
                    r--;
            }
        }
    }
    return new ArrayList(ans);
  }
}