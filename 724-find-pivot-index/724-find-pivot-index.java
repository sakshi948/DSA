class Solution {
    public int pivotIndex(int[] nums) {
        int arr1[] = new int [nums.length];
        int arr2[] = new int[nums.length];
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            arr1[i]=temp;
            temp=temp+nums[i];
        }
        temp=0;
        for(int i=nums.length-1;i>=0;i--){
            arr2[i]=temp;
            temp=temp+nums[i];
        }
        
        for(int i =0;i<nums.length;i++){
            if(arr1[i]==arr2[i])
                return i;
        }
        
        return -1;
        
    }
}