class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        
        if (m > n){
            int[] temp = A;
            A = B;
            B = temp;
            
            int t = m;
            m = n;
            n = t;
        }
        
        int lo = 0;
        int hi = m;
        int total =  m + n;
        
        while (lo <= hi){
            int partX = (lo + hi) / 2;
            int partY = (total + 1) / 2 - partX;
            
            int leftX = getMax(A, partX);
            int rightX = getMin(A, partX);
            
            int leftY = getMax(B, partY);
            int rightY = getMin(B, partY);
            
            if (leftX <= rightY && leftY <= rightX){
                if (total % 2 == 0)
                    return (Math.max(leftX, leftY) + Math.min(rightX, rightY)) / 2.0;
                return Math.max(leftX, leftY);
            }
            if(leftX > rightY) 
			   hi = partX - 1;
            else 
			   lo = partX + 1;
        }
        
        return - 1;
        
    }
    
    private int getMax(int[] nums, int partition){
        if (partition == 0)
            return (int)Double.NEGATIVE_INFINITY;
        return nums[partition - 1];
    }
    
    private int getMin(int[] nums, int partition){
        if (partition == nums.length)
            return (int)Double.POSITIVE_INFINITY;
        return nums[partition];
    }
}