class Solution {
    
    public static int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int x: nums) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for(var x: map.entrySet()) {
                int value = x.getKey();
                int count = x.getValue();
                if(count > (nums.length/2)) {
                    return value;
                }
        }

        return -1;
     
    }
}