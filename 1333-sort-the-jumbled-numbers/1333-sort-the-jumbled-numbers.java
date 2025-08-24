public class Solution {

    private int map(int num, int[] mapping) {

        if (num == 0)
            return mapping[0];

        int res = 0;
        int place = 1;
        while (num > 0) {
            int digit = num % 10;
            res += (mapping[digit]) * place;
            place *= 10;
            num /= 10;
        }

        return res;

    }

    public int[] sortJumbled(int[] mapping, int[] nums) {

        int n = nums.length;
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = map(nums[i], mapping);
            pairs[i][1] = nums[i];
        }

        // Arrays.sort(pairs, new Comparator<int[]>() {
        //         public int compare(int[] a, int[] b) {
        //             return Integer.compare(a[0], b[0]);
        //         }
        // }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = pairs[i][1];
        }

        return res;

    }
}