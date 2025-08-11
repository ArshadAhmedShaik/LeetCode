class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
     
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return map.get(b) - map.get(a); 
            }
        });

 
        q.addAll(map.keySet());

        int index = 0;
        while (k-- > 0) {
            result[index++] = q.poll();
        }

        return Arrays.copyOf(result, index);
    }
}
