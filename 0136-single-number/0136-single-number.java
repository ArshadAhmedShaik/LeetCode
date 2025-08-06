class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(var x: nums) {
            xor ^= x;
        }
        return xor;
    }
}