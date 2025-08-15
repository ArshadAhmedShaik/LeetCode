class Solution {
    public List<Integer> majorityElement(int[] nums) {

           int n = nums.length;
           Map<Integer, Integer> map = new HashMap<>();
           List<Integer> list = new ArrayList<>();
            
            for(int x: nums) {
                map.put(x, map.getOrDefault(x, 0)+1);
            }

            for(var x: map.entrySet()) {
                    int key = x.getKey();
                    int value = x.getValue();
                    if(value>n/3) {
                        list.add(key);
                    }
            }

            return list;
    }
}