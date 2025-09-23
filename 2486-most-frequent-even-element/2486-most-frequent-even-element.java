class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
              map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int maxFreq = 0;
        int element = -1;
        for(var x: map.entrySet()) {
                int key = x.getKey();
                int value = x.getValue();
                if(key%2!=0) continue;
                if(value > maxFreq) {
                    maxFreq = value;
                    element = key;
                } else if(value == maxFreq) {
                    element = Math.min(element, key);
                }
        }
        return element;
    }
}