class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
        Map<Integer, Integer> map = new HashMap<>(wall.size() * 4);
        int max = 0;

        for (List<Integer> row : wall) {
            int sum = 0;
            int end = row.size() - 1; 
            for (int i = 0; i < end; i++) {
                sum += row.get(i);
                int count = map.getOrDefault(sum, 0) + 1;
                map.put(sum, count);
                if (count > max) max = count; 
            }
        }

        return wall.size() - max;
    }
}
