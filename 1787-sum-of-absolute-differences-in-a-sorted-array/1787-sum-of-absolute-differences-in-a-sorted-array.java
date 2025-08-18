class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int totalSum = 0;
        for (int x : nums) totalSum += x;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int left = (i == 0) ? 0 : i * nums[i] - sum;
            int right = (i == n - 1) ? 0 : (totalSum - (sum + nums[i])) - (n - i - 1) * nums[i];

            result[i] = left + right;

            sum += nums[i];  
        }

        return result;
    }
}
