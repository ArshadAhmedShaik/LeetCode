class Solution {
 

    public static int subarraysDivByK(int[] nums, int k) {
        int[] freq = new int[k];
        freq[0] = 1;

        int sum = 0, count = 0;
        for (int x : nums) {
            sum += x;
            int rem = sum % k;
            if (rem < 0) rem += k;

            int cnt = freq[rem];
            count += cnt;
            freq[rem] = cnt + 1;
        }
        return count;
    }
}
