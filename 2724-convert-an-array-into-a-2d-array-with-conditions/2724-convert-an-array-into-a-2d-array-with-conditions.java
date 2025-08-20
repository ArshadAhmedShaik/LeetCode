class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] count = new int[201];
        for(int x: nums) {
            count[x]++;
        }
        int maxCount = 0;
        int maxIndex = -1;
        for(int i = 1;i <= 200;i++) {
                if(count[i]>maxCount) {
                        maxCount = count[i];
                        maxIndex = i;
                }
        }
        List<List<Integer>> ans = new ArrayList<>();
        while(count[maxIndex]!=0) {
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
