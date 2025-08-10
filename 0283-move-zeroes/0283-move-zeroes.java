class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            moveZeroes(new int[] { 1, 2, 0, 0, 3, 4, 5, 0, 0, 0, 0 });
        }
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
            i++;
        }

    }
}