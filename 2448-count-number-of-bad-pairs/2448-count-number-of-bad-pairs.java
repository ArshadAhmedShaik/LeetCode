class Solution {
    public long countBadPairs(int[] nums) {
                     long badPairs = 0;
    // map will just count the number of times good pairs are occuring to     the left of a particular element:
                     Map<Integer, Integer> map = new HashMap<>();
                     int n = nums.length;
                     for(int i = 0;i < n;i++) {
                            int diff = i - nums[i];
                            int goodPairs = 0;
                            if(map.containsKey(diff)) {
                                    goodPairs = map.get(diff);
                            } else {
                                goodPairs = 0;
                            }

                           badPairs += i - goodPairs;
                           map.put(diff, map.getOrDefault(diff, 0)+1);         

                     }

             return badPairs;        
    }
}