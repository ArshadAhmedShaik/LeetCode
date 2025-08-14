class Solution {
    
    public static int majorityElement(int[] nums) {
            // brute force:

            int n = nums.length;
            Set<Integer> set = new HashSet<>();
            for(int i = 0;i < n;i++) {
                    if(!set.contains(nums[i])) {
                            int count = 0;
                            set.add(nums[i]);
                            for(int j = 0;j < n;j++) {
                                   if(nums[i]==nums[j]) {
                                        count++;
                                   }
                            }
                            if(count>(n/2)) return nums[i];
                    }
            } 

            return -1;
    }
}