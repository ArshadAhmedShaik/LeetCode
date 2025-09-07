import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minOperations(int[] nums) {
        int[] counts = new int[1000001];
        for (int x : nums) {
            counts[x]++;
        }

        int operations = 0;

        for (int count : counts) {
            if (count==0) continue;
            if (count == 1) return -1; 
            else if (count % 3 == 0) {
                operations += count / 3;
            } else if (count % 3 == 1) {
                if (count < 4) return -1; 
                operations += (count - 4) / 3 + 2;
            } else { 
                operations += (count - 2) / 3 + 1; 
            }
        }

        return operations;
    }
}
