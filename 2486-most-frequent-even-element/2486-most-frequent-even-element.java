class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] count = new int[100001];
        for(int i = 0;i < nums.length;i++) {
              count[nums[i]]++;
        }
        int maxFreq = 0;
        int element = -1;
        for(int i = 0;i < count.length;i++) {
            if(i%2==0) {
                if(count[i] > maxFreq) {
                    maxFreq = count[i];
                    element = i;
                }
            }
        }
        return element;
    }
}