class Solution {
    private int productDiff(int a, int b, int c, int d) {
                return (a * b) - (c * d);
    }
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length-1];
        int b = nums[nums.length-2];
        int c = nums[0];
        int d = nums[1];
        return productDiff(a,b,c,d);
    }
}