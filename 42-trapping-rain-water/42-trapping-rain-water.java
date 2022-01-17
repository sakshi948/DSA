class Solution {
    public int trap(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++){
            int leftMax = 0, rightMax = 0;
            for (int k = i; k >= 0; k--){
                leftMax = Math.max(leftMax, height[k]);
            }
            for (int j = i; j < height.length; j++){
                rightMax = Math.max(rightMax, height[j]);
            }
            res += Math.min(leftMax, rightMax) - height[i];
        }
        return res;
    }
}