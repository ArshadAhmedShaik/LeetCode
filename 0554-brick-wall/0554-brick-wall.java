class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (var row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                int count = map.getOrDefault(sum, 0) + 1;
                map.put(sum, count);
                max = Math.max(max, count);
            }
        }

        return wall.size() - max;
    }
}
