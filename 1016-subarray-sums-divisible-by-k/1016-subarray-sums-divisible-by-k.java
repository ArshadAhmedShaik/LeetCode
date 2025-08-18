class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        
        int sum = 0, count = 0;
        for (int x : nums) {
            sum += x;
            int rem = ((sum % k) + k) % k;   
            count += freq.getOrDefault(rem, 0);
            freq.put(rem, freq.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}
