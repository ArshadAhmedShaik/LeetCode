class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        for(var x: nums) {
            count[x]++;
        }
        int result = 0;
        for(var x: count) {
            result += (x*(x-1))/2;
        }
        return result;
    }
}