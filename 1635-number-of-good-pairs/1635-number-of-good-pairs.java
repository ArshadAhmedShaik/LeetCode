class Solution {
    public int numIdenticalPairs(int[] nums) {
       Map<Integer, Integer> map = new HashMap<>();
       int res = 0;
       for(var x: nums) {
            res += map.getOrDefault(x, 0);
            map.put(x, map.getOrDefault(x, 0)+1);
       }
       return res;
    }
}