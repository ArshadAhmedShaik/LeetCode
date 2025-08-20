class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] count = new int[201];
        int maxFreq = 0;

        for (int x : nums) {
            count[x]++;
            maxFreq = Math.max(maxFreq, count[x]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < maxFreq; i++) {
            ans.add(new ArrayList<>());
        }

        for (int i = 1; i <= 200; i++) {
            int freq = count[i];
            for (int j = 0; j < freq; j++) {
                ans.get(j).add(i);
            }
        }

        return ans;
    }
}
