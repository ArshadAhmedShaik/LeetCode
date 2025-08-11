class Solution {
    public int[] sortArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(var x: nums) {
            max =  Math.max(max, x);
            min =  Math.min(min, x);
        }
        int[] count = new int[max-min+1];
        int offset = -min;
        for(var x: nums){
            count[x+offset]++;
        }
        int index = 0;
        for(int i = 0;i < count.length;i++) {
            while(count[i]!=0) {
                nums[index++] = i - offset;
                count[i]--;
            }
        }
        return nums;
    }
}