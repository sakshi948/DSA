class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1);
                if(mp.get(arr[i])>arr.length/2)
                {
                    ans=arr[i];
                    break;
                }
            }
            else
            {
                mp.put(arr[i],1);
                if(mp.get(arr[i])>arr.length/2)
                {
                    ans=arr[i];
                    break;
                }
            }
        }
        return ans;
    }
}