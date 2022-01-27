class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<Integer>();
        for (int num : nums) ans.add(num);
        return nums.length - ans.size() != 0;
    }
}