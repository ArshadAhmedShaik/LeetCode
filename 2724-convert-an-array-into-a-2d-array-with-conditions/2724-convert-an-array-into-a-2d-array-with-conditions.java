class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] count = new int[201];
        for (int x : nums) count[x]++;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= 200; i++) {
            int freq = count[i];
            for (int row = 0; row < freq; row++) {
                if (ans.size() <= row) {
                    ans.add(new ArrayList<>());
                }
                ans.get(row).add(i);
            }
        }
        return ans;
    }
}
