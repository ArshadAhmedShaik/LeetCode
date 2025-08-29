class Solution {
    public long countBadPairs(int[] nums) {
        long bad = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            bad += i - map.getOrDefault(i - nums[i], 0);
            map.merge(i - nums[i], 1, Integer::sum);
        }
        return bad;
    }
}
