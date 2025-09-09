class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int max = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
        } 
        int[] sort = new int[max+1];
        for (int i = 0 ; i < nums.length; i++) {
            sort[nums[i]]++;
        } 
        int p = 0;
        for (int i = 0; i < sort.length; i++) {
            int c = sort[i];
            for (int j = 0; j < c; j++) {
                nums[p++] = i;
            }
        }
        
        for (int i = 0; i < nums.length; i+=3) {
            if (nums[i + 2] - nums[i] > k) return new int[0][];
        }
        int[][] result = new int[nums.length / 3][];
        p = 0;
        for (int i = 0; i < result.length; i ++) {
            result[i] = new int[] {nums[p++], nums[p++], nums[p++]};
        }
        return result;
    }
}