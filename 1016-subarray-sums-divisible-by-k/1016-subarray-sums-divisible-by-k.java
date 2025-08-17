class Solution {
    public static int subarraysDivByK(int[] nums, int k) {
        int map[] = new int[k];
        map[0] = 1;

        int count = 0, sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int mod = sum % k;
            if(mod < 0) mod += k;
            count += map[mod]++;
        }

        return count;
    }
}