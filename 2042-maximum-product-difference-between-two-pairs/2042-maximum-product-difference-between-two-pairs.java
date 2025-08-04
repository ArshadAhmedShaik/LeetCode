class Solution {

    public int maxProductDifference(int[] nums) {

        int[] count = new int[10001];

        for(var x: nums) {
            count[x]++;
        }

        
        int index = 0;
        for(int i = 0;i < count.length;i++) {
                while(count[i]!=0) {
                        nums[index++] = i;
                        count[i]--;
                }
        }
        
        int n = nums.length;
        return (nums[n - 1] * nums[n - 2]) - (nums[0] * nums[1]);
    }

}