class Solution {
    public long countBadPairs(int[] nums) {
        long bad = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = i - nums[i];
            bad += i - map.getOrDefault(diff, 0);
            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }
        return bad;
    }
}
