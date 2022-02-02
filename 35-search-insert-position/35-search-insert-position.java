class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
		// Used following approach to find mid, as simply using (start + end) / 2 
		// could give error in case (start + end) exceeds the int range for java
            int mid = start + (end-start)/2;
			//If target element is less than current element, search in the left
            if(target < nums[mid]){
                end = mid -1;
			//If target element is greater than current element, search in the right
            }else if(target > nums[mid]){
                start = mid +1;
            }else {
			//Else current element is equal to target, return current index
                return mid;
            }
        }
		//If element not found, then the probable index to add would be end +1; 
        return end+1;
    }
}