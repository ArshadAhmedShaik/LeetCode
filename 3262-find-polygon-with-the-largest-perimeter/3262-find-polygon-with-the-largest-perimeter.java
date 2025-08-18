class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for (int num : nums) sum += num;

    
        for (int i = nums.length - 1; i >= 2; i--) {
            long largest = nums[i];
            long rest = sum - largest;  
            if (rest > largest) {
                return sum;  
            }
            sum -= largest;  
        }

        return -1; 
    }
}
