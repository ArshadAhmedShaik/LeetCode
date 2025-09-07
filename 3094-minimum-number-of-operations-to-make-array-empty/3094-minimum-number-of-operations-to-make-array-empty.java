import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minOperations(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int MAX_ARRAY = 1_000_000;
        int[] counts = new int[MAX_ARRAY + 1];
        Map<Integer, Integer> largeCounts = new HashMap<>();

        for (int x : nums) {
            if (x <= MAX_ARRAY) counts[x]++;
            else largeCounts.put(x, largeCounts.getOrDefault(x, 0) + 1);
        }

        int operations = 0;

        for (int count : counts) {
            if (count == 0) continue;
            int ops = minOps(count);
            if (ops == -1) return -1;
            operations += ops;
        }

        for (int count : largeCounts.values()) {
            int ops = minOps(count);
            if (ops == -1) return -1;
            operations += ops;
        }

        return operations;
    }

    private int minOps(int count) {
        if (count == 1) return -1;
        if (count % 3 == 0) return count / 3;
        if (count % 3 == 1) {
            if (count < 4) return -1;
            return (count - 4) / 3 + 2;
        }
        return (count - 2) / 3 + 1;
    }
}
