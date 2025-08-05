class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
           
           Map<Integer, Integer> map = new HashMap<>();

           for(var x: nums) {
                map.put(x, map.getOrDefault(x, 0)+1);
           }

           int target = n / 2;

           for(var x: map.entrySet()) {
                int value = x.getKey();
                int freq = x.getValue();
                if(freq>target) {
                    return value;
                }
           }

           return -1;

        /*Follow Up*/

           
    }
}