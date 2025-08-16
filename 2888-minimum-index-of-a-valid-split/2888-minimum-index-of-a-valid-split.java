class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        int half = n / 2;
        int majority = -1, count = 0;
        for (int x : nums) {
            if (x == majority) {
                count++;
            } else if (count == 0) {
                majority = x;
                count = 1;
            } else {
                count--;
            }
        }
        int dominant = majority;

        
        int total = 0;
        for (int x : nums) {
            if (x == dominant) total++;
        }

        
        int leftCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == dominant) leftCount++;

            int leftLen = i + 1;
            int rightCount = total - leftCount;
            int rightLen = n - leftLen;

            if (leftCount > leftLen / 2 && rightCount > rightLen / 2) {
                return i;
            }
        }

        return -1;
    }
}
