class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int[] count = new int[n+1];
        for(var x: nums) {
                count[x]++;
        }
        for(int i = 1;i < count.length;i++) {
            if(count[i]==0) {
                list.add(i);
            }
        }
        return list;
    }
}