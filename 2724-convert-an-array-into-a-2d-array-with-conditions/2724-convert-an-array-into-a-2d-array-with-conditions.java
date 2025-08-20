class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] freq = new int[201];
        
        for (int x : nums) {
            int row = freq[x]++;
            if (ans.size() <= row) {
                ans.add(new ArrayList<>());
            }
            ans.get(row).add(x);
        }
        return ans;
    }
}
