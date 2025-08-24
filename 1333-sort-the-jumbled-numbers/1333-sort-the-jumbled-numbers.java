import java.util.*;

public class Solution {

    private int map(int num, int[] mapping) {
        if (num == 0) return mapping[0]; 

        int res = 0, place = 1;
        while (num > 0) {
            int digit = num % 10;
            res += mapping[digit] * place;
            place *= 10;
            num /= 10;
        }
        return res;
    }

    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

      
        for (int i = 0; i < n; i++) {
            arr[i][0] = map(nums[i], mapping); 
            arr[i][1] = i;                     
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]); 
        });

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = nums[arr[i][1]];
        }

        return res;
    }
}
