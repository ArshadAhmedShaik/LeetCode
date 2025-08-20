class Solution {
    private boolean isEmpty(int[] count) {
            for(int i = 1;i < 200;i++) {
                    if(count[i]!=0) return false; 
            }
            return true;
    }
    public List<List<Integer>> findMatrix(int[] nums) {
            int[] count = new int[201];

            for(int x: nums) {
                count[x]++;
            }

            List<List<Integer>> ans = new ArrayList<>();

            while(!isEmpty(count)) {
            List<Integer> list = new ArrayList<>();
            for(int i = 1;i <= 200;i++) {
                    if(count[i]!=0) {
                        list.add(i);
                        count[i]--;
                    }
            }
            ans.add(list);
        } 
            return ans;
    }
}