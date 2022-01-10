class Solution {
    public void bt(int[]num,int index,List<Integer> curr,List<List<Integer>>ans)
    {
        if(index>=num.length)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        //exclude
        bt(num,index+1,curr,ans);
        
        //include
        curr.add(num[index]);
        bt(num,index+1,curr,ans);
        curr.remove(curr.size()-1);
        
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        int index=0;
        bt(nums,index,curr,ans);
        return ans;
    }
}