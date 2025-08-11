class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return map.get(b) - map.get(a); 
            }
        });

 
        q.addAll(map.keySet());

    
        while (k-- > 0) {
            list.add(q.poll());
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
