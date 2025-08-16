class Solution {
    public int subarraySum(int[] nums, int k) {
            // k = 3
            // [1,2,3,-3,1,1,1,6]
 
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int sum = 0;
            int count = 0;
            int n = nums.length;
         
            for(int i = 0;i < n;i++) {
                    sum += nums[i];
                    int requiredSum = sum - k;
                    if(map.containsKey(requiredSum)) {
                            count += map.get(requiredSum);
                    }
                    map.put(sum, map.getOrDefault(sum, 0)+1);
            }

            return count;


    }
}